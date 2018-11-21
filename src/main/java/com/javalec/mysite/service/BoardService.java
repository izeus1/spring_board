package com.javalec.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.mysite.dao.BoardDAO;
import com.javalec.mysite.vo.BoardVO;

@Service("boardService")
public class BoardService implements IBoardService {

	@Autowired
	private BoardDAO boarddao; //mybatis활용 준비! 
	
	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boarddao.insert(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boarddao.delete(vo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boarddao.getBoardList(); 
	}

	@Override
	public BoardVO selectOneBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boarddao.selectOne(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boarddao.update(vo);
		
	}

//	@Override
//	public List<BoardVO> searchNameList(String keyword) {
//		// TODO Auto-generated method stub
//		System.out.println("GBService_searchNameList() 호출"); //정상 호출 확인
//		keyword = "%" + keyword + "%";
//		return dao.searchNameList(keyword); 
//	}
//
//	@Override
//	public List<BoardVO> searchContentList(String keyword) {
//		// TODO Auto-generated method stub
//		System.out.println("GBService_searchContentList() 호출"); //정상 호출 확인 
//		keyword = "%" + keyword + "%";
//		return dao.searchContentList(keyword);
//	}

}
