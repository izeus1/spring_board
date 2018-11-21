package com.javalec.mysite.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.mysite.vo.BoardVO;

@Repository("boarddao")
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis; 
	
	
//	private Connection getConnection() throws SQLException {
//		Connection conn = null;
//		try {
//			// JDBC 
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			// Connection 
//			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //jdbc
//			conn = DriverManager.getConnection(url, "scott", "tiger");
//		} catch (ClassNotFoundException e) {
//			System.out.println("占쎈굡占쎌뵬占쎌뵠甕곤옙 嚥≪뮆逾� 占쎈뼄占쎈솭:" + e);
//		}
//		return conn;
//	}

	public List<BoardVO> getBoardList() { 
		
		return mybatis.selectList("BoardDAO.getBoardList"); 
	}

	public BoardVO selectOne(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.selectOne", vo); 
	}

	public void insert(BoardVO vo) {
		mybatis.insert("BoardDAO.insert", vo); 
	}

//==================update===========================================
	public void update(BoardVO vo) {
		mybatis.update("BoardDAO.update", vo); 
	}
	
	public void delete(BoardVO vo) { 
		mybatis.delete("BoardDAO.delete", vo); 	
	}

//==================search_name()=====================================
	public List<BoardVO> searchNameList(String keyword) { 
		return mybatis.selectList("BoardDAO.searchNameList", keyword); 
	}
	
//==================search_content()==================================
	public List<BoardVO> searchContentList(String keyword) {
		return mybatis.selectList("BoardDAO.searchContentList", keyword); 
	}

}
