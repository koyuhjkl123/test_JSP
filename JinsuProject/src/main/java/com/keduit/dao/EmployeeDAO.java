package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import com.keduit.dto.EmployeeVO;
import com.keduit.util.DBManager;

public class EmployeeDAO {
	
	private EmployeeDAO() {};
	
	private static EmployeeDAO instance = new EmployeeDAO();
	
	public static EmployeeDAO getInstance() {
		return instance;
	}
	
	
	
	public List<EmployeeVO> selectAllEmployee(){
		
		
		String sql = "select * from employees order by id desc";
		
		List<EmployeeVO> lists = new ArrayList<EmployeeVO>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		conn = DBManager.getConnection();
		try {
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				EmployeeVO evo = new EmployeeVO();
				
				
				evo.setUserid(rs.getString("id"));
				evo.setPass(rs.getString("pass"));
				evo.setName(rs.getString("name"));
				evo.setEnter(rs.getTimestamp("enter"));
				evo.setPhone(rs.getString("phone"));
				
				if(rs.getString("lev").equals("A")) {
					evo.setLev("운영자");
				}else if(rs.getString("lev").equals("B")) {
					evo.setLev("일반회원");
				}else {
					
				}
				
				if(rs.getString("gender").equals("1")){
					evo.setGender("남자");
				}else if(rs.getString("gender").equals("2")) {
					evo.setGender("여자");
				}else {
					
				}
				
				lists.add(evo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, stmt, rs);
		}
		
		return lists;
	}
	
	public EmployeeVO selectOne(String userid) {
		
		String sql = "select * from employees where id = ?";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO evo = null;
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				evo = new EmployeeVO();
				evo.setUserid(rs.getString("id"));
				evo.setPass(rs.getString("pass"));
				evo.setName(rs.getString("name"));
				evo.setPhone(rs.getString("phone"));
				evo.setEnter(rs.getTimestamp("enter"));
				
				if(rs.getString("lev").equals("A")) {
					evo.setLev("운영자");
				}else {
					evo.setLev("일반회원");
				}
				
				if(rs.getString("gender").equals("1")) {
					evo.setGender("남자");
				}else {
					evo.setGender("여자");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return evo;
	}
	
	
	public void employeeInsert(EmployeeVO bvo) {
		
		String sql = "insert into employees(id, pass, name, lev, enter, gender, phone) values" + 
		"(?, ?, ?, ?, ?, ?, ?)";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			
			if(bvo.getLev().equals("운영자")) {
				pstmt.setString(4, "A");
			}else {
				pstmt.setString(4, "B");
			}
			if(bvo.getGender().equals("남자")) {
				pstmt.setString(6, "1");
			}else {
				pstmt.setString(6, "2");
			}
			pstmt.setString(1, bvo.getUserid());
			pstmt.setString(2, bvo.getPass());
			pstmt.setString(3, bvo.getName());
			pstmt.setString(7, bvo.getPhone());
			pstmt.setTimestamp(5, bvo.getEnter());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
		
	}
	
	public EmployeeVO employeeUpdate(EmployeeVO evo, String userid) {
		
		String sql = "update employees set id = ?, pass = ?, name = ?, lev = ?, gender = ?, phone = ? where id = ?";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
		
			pstmt.setString(1, evo.getUserid());
			pstmt.setString(2, evo.getPass());
			pstmt.setString(3, evo.getName());
			pstmt.setString(4, evo.getLev());
			pstmt.setString(5, evo.getGender());
			pstmt.setString(6, evo.getGender());
			pstmt.setString(7, userid);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
		return evo;
		
	}
	
	
	public void deleteEmployee(String userid) {
		
		String sql = "delete from employee where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			int result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}
	
	

}
