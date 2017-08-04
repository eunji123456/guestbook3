package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.dao.guestBookDao;
import com.javex.vo.guestBookVo;

@Controller
public class guestBookController {

@Autowired guestBookDao dao;

	@RequestMapping("/add")
	public String form(@ModelAttribute guestBookVo vo) {
		System.out.println("에드 ");
		dao.insert(vo);
		return"redirect:/list";
	}

	@RequestMapping("/deleteform")
	public String delteform () {
		return"deleteform";
		
	}
	@RequestMapping("/delete")
	public String delte(@ModelAttribute guestBookVo vo) {
		dao.delete(vo.getNo(),vo.getPassword());
		System.out.println(vo.getNo()+vo.getPassword());
		return"redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("리스트에 들어옴 ");
		List <guestBookVo> list = dao.getlist();
		model.addAttribute("list",list);
		
		return"list";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("리스트에 들어옴 ");
		return"hello";
	}
	
}
