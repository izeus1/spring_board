package com.javalec.mysite.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.mysite.vo.UsersVO;

@Repository("usersdao")
public class UsersDAO {
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

	public List<UsersVO> getUsersList() { 
		
		return mybatis.selectList("UsersDAO.getList"); 
	}

	public UsersVO selectOne(UsersVO vo) {
		return mybatis.selectOne("UsersDAO.selectOne", vo); 
	}

	public void insert(UsersVO vo) {
		mybatis.insert("UsersDAO.insert", vo); 
	}

//==================update===========================================
	public void update(UsersVO vo) {
		mybatis.update("UsersDAO.update", vo); 
	}
	
	public void delete(UsersVO vo) { 
		mybatis.delete("UsersDAO.delete", vo); 	
	}

////==================search_name()=====================================
//	public List<UsersVO> searchNameList(String keyword) { 
//		return mybatis.selectList("GuestBookDAO.searchNameList", keyword); 
//	}
//	
////==================search_content()==================================
//	public List<UsersVO> searchContentList(String keyword) {
//		return mybatis.selectList("GuestBookDAO.searchContentList", keyword); 
//	}

}
