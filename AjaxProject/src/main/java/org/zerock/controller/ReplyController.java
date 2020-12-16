package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.ReplyMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/reply/*")
@AllArgsConstructor



public class ReplyController {
	private ReplyMapper mapper;
	
	@GetMapping(value = "/intro")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list",mapper.getList());
   
	}
	
	
	
}
