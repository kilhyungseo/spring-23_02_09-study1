package com.hyungso.root;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	
	@RequestMapping(value = "/idInput")
	public String idInput() {
		
		return "idInput";
	}
	
	@RequestMapping(value = "/idOk")
	public String idOk(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		
		if(id.equals("admin")) {
			return "redirect:idYes";	
		}else {
			return "redirect:idNo";
		}
	}	
	@RequestMapping(value = "/idYes")
	public String idYes() { //바로 jsp파일로 연결
		
		return "idYes";
	}
	
	@RequestMapping(value = "/idNo")
	public String idNo() {
		
		return "idNo";
	}
	
	@RequestMapping(value = "/naver")
	public String naver() {	// Controller로 다시 한번 Mapping하고 jsp파일 연결
	
		return "redirect:http://www.naver.com";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		
		return "redirect:http://localhost:8888/root/test.jsp";
	}
}
