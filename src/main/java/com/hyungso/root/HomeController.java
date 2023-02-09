package com.hyungso.root;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(HttpServletRequest request, Model model) {
		String mname = request.getParameter("mname");
		//String memberPw = request.getParameter("mpw");
		
		model.addAttribute("mname", mname);
		
		
		return "memberView";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String memberpost(HttpServletRequest request, Model model) {
		String memberId = request.getParameter("mid");
		String memberPw = request.getParameter("mpw");
		
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberPw", memberPw);
		
		return "memberView";
	}
}
