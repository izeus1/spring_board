package com.javalec.mysite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.mysite.service.IUsersService;


@Controller
public class UsersController {
	@Autowired
	private IUsersService UsersService; 
	
	
	//추가됨. 
	
	
	
//	@RequestMapping("/list.do")
//	public String getBoardList(HttpServletRequest req, HttpServletResponse resp, GuestBookDAO dao, Model model) {
//		
//		String keyword = req.getParameter("keyword");
//		String searchtype = req.getParameter("searchtype");
//		
//		if(keyword == null || keyword.isEmpty()) {
//			model.addAttribute("list", boardService.;
//		}
//		else { 
//			if(searchtype.equals("keywordname")) {
//				System.out.println("이름(name) 검색 호출"); //정상 호출 
//				model.addAttribute("list", boardService.searchNameList(keyword));
//			}
//			else {
//				System.out.println("내용(content) 검색 호출"); //정상 호출 
//				model.addAttribute("list", boardService.searchContentList(keyword));
//			}
//		}
//		return "index.jsp";
//	}
	
//	@RequestMapping("/add.do")
//	public String insertGuestBook(GuestBookVO vo, GuestBookDAO dao) {
//		System.out.println("add 호출");
//		guestBookService.insertGuestBook(vo); //guestBookService
//		return "list.do"; 
//	}
//	
//	@RequestMapping("/delete.do")
//	public String deleteGuestBook(GuestBookVO vo, GuestBookDAO dao) {
//		
//		guestBookService.deleteGuestBook(vo);
//		return "list.do"; 
//	}
//	
//	
//	@RequestMapping("/deleteform.do")
//	public String deleteFormController(GuestBookVO vo) {
//		
//		return "deleteform.jsp"; 
//	}
	
	@RequestMapping("/login.do")
	public String loginUsers(HttpServletRequest req, HttpSession session) {
		String id = req.getParameter("id"); 
		String password = req.getParameter("password");
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		
		System.out.println("/login.do 호출");; 
		
		if((id == null)||(password == null)){
			return "login.jsp"; 
		}
	return "list.do";
	}
	
//	@RequestMapping("/selectone.do")
//	public String selectOneGuestBook(GuestBookVO vo, GuestBookDAO dao, Model model) {
//		System.out.println("selectone.do 호출!");
//		
//		guestBookService.selectOneGuestBook(vo);//guestBookService - vo에 번호 세팅! 
//		model.addAttribute("selectone", guestBookService.selectOneGuestBook(vo)); // "key" >> 조회해올 값을 그대로 가지고 와야한다. 
//		
//		return "selectone.jsp"; 
//		
//	}
	
//	@RequestMapping("/update.do")
//	public String updateGuestBook(GuestBookVO vo, GuestBookDAO dao) {
//		System.out.println("update.do 호출!");
//		guestBookService.updateGuestBook(vo); //guestBookService���� ����
//		return "list.do"; 
//	}
//	
//	@RequestMapping("/updateform.do")
//	public String updateFormController() {
//		
//		return "updateform.jsp"; 
//	}
	
}
