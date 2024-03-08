package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.keduit.dto.memberVO;

import oracle.jdbc.proxy.annotation.Pre;

public class MemberDAO {

	private MemberDAO() {

	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
//		DBCP 연동하는 getConnection 메서드
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");

		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();

		return conn;
	}

	public int userCheck(String userid, String pwd) {

		int result = -1; // 아이디를 읽지 못할 경우

		String sql = "select pwd from member where userid = ?";
		Connection conn = null;
		PreparedStatement pstmt;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString("pwd").equals(pwd) && rs.getString("pwd") != null) {
					result = 1;
				} else {
					result = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public memberVO getMember(String userid) {

		System.out.println("오는지 테스트를 하기 위함" + userid);
		memberVO mvo = null;
		String sql = "select * from member where userid = ?";

		// 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				mvo = new memberVO();
				mvo.setName(rs.getString("name"));
				mvo.setUserid(rs.getString("userid"));
				mvo.setPwd(rs.getString("pwd"));
				mvo.setEmail(rs.getString("email"));
				mvo.setPhone(rs.getString("phone"));
				mvo.setAdmin(rs.getInt("admin"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mvo;
	}

	public int confirmID(String userid) {

		int result = -1;

		String sql = "select userid from member where userid =?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 회원 등록
	public int InsertMember(memberVO mvo) {

		int result = -1;

		String sql = "insert into member values(?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getUserid());
			pstmt.setString(3, mvo.getPwd());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setString(5, mvo.getPhone());
			pstmt.setInt(6, mvo.getAdmin());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	public int updateMember(memberVO mvo) {
		
		int result = -1;
		
		String sql = "update member set pwd = ?, email = ?, phone = ?, admin = ? where userid = ?";
		
		try (
				Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			
			pstmt.setString(1, mvo.getPwd());
			pstmt.setString(2, mvo.getEmail());
			pstmt.setString(3, mvo.getPhone());
			pstmt.setInt(4, mvo.getAdmin());
			pstmt.setString(5, mvo.getUserid());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
