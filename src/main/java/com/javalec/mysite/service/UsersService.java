package com.javalec.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.mysite.dao.UsersDAO;
import com.javalec.mysite.vo.UsersVO;

@Service("usersService")
public class UsersService implements IUsersService {

	@Autowired
	private UsersDAO usersdao; //mybatis활용 준비! 
	
	@Override
	public void insertUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersdao.insert(vo);
	}

	@Override
	public void deleteUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersdao.delete(vo);
	}

	@Override
	public List<UsersVO> getUsersList() {
		// TODO Auto-generated method stub
		return usersdao.getUsersList(); 
	}

	@Override
	public UsersVO selectOneUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		return usersdao.selectOne(vo);
	}

	@Override
	public void updateUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersdao.update(vo);
		
	}

//	@Override
//	public List<UsersVO> searchNameList(String keyword) {
//		// TODO Auto-generated method stub
//		System.out.println("GBService_searchNameList() 호출"); //정상 호출 확인
//		keyword = "%" + keyword + "%";
//		return dao.searchNameList(keyword); 
//	}
//
//	@Override
//	public List<UsersVO> searchContentList(String keyword) {
//		// TODO Auto-generated method stub
//		System.out.println("GBService_searchContentList() 호출"); //정상 호출 확인 
//		keyword = "%" + keyword + "%";
//		return dao.searchContentList(keyword);
//	}

}
