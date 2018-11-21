package com.javalec.mysite.service;

import java.util.List;

import com.javalec.mysite.vo.UsersVO;

public interface IUsersService {

	public void insertUsers(UsersVO vo); 
	public void deleteUsers(UsersVO vo);
	public List<UsersVO> getUsersList(); 
	public UsersVO selectOneUsers(UsersVO vo); 
	public void updateUsers(UsersVO vo); 
//	public List<UsersVO> searchNameList(String keyword);
//	public List<UsersVO> searchContentList(String keyword);
	
	
}
