package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.keduit.dto.BoardVO;
import com.keduit.util.DBManager;

public class BoardDAO {

//	싱글톤 작성
//	new 못함 private으로 인해
//	getInstance만 가능

//	1. Default 생성자를 private으로 
	private BoardDAO() {
	};

//	2. private 정적 instance 생성(new 생성자)
	private static BoardDAO instance = new BoardDAO();

//	3. static instance를 리턴하는 정적메서드
	public static BoardDAO getInstance() { // public static으로 정적 공유
		return instance;
	}

	public List<BoardVO> selectAllBoard() {

		String sql = "select * from board order by num desc";

		List<BoardVO> list = new ArrayList();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = DBManager.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BoardVO bVO = new BoardVO();

				bVO.setNum(rs.getInt("num"));
				bVO.setPass(rs.getString("pass"));
				bVO.setName(rs.getString("name"));
				bVO.setEmail(rs.getString("email"));
				bVO.setTitle(rs.getString("title"));
				bVO.setContent(rs.getString("content"));
				bVO.setReadcount(rs.getInt("readcount"));
				bVO.setWritedate(rs.getTimestamp("writedate"));

				list.add(bVO);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}

		return list;
	}

	public void insertBoard(BoardVO bVO) {

		String sql = "insert into board(" + "num, pass, name, email, title, content) "
				+ "values(board_seq.nextval, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bVO.getPass());
			pstmt.setString(2, bVO.getName());
			pstmt.setString(3, bVO.getEmail());
			pstmt.setString(4, bVO.getTitle());
			pstmt.setString(5, bVO.getContent());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}

	}

	public BoardVO selectOne(String num) {

		BoardVO bVO = null;
		String sql = "select * from board where num = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				bVO = new BoardVO();

				bVO.setNum(rs.getInt("num"));
				bVO.setName(rs.getString("name"));
				bVO.setPass(rs.getString("pass"));
				bVO.setEmail(rs.getString("email"));
				bVO.setTitle(rs.getString("title"));
				bVO.setContent(rs.getString("content"));
				bVO.setWritedate(rs.getTimestamp("writedate"));
				bVO.setReadcount(rs.getInt("readcount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		System.out.println("-------- selectOne -------- " + bVO);
		return bVO;
	}

	public void updateReadcount(String num) {
//		update 구문으로 해당 readcount 값을 +1 하는 sql 구문
		String sql = "update board set readcount = readcount + 1 where num = ?";
//		초기화
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void updateBoard(BoardVO bVO) {
//		게시글 수정
		String url = "update board set email = ?, pass = ?, title=?, content=? where num = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(url);
			
			pstmt.setString(1, bVO.getEmail());
			pstmt.setString(2, bVO.getPass());
			pstmt.setString(3, bVO.getTitle());
			pstmt.setString(4, bVO.getContent());
			pstmt.setInt(5, bVO.getNum());
			
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}
	
	public void deleteBoard(String num) {
//		게시글 삭제
		String url = "delete from board where num = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(url);
			
			pstmt.setString(1, num);
			
			int result = pstmt.executeUpdate();
			System.out.println("삭제 결과 : " + result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
