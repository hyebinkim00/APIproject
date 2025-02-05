package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.TestVO;
import org.zerock.mapper.TestMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/tests/*")
@AllArgsConstructor
public class TestController {
	private TestMapper mapper;
	
	@GetMapping(value = "/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list",mapper.getList());
		
	}
	
	@GetMapping(value="/register")
	public void register() {
		
	}
	
	
	@PostMapping(value="/register")
	public String insert(TestVO testvo,RedirectAttributes rttr) {
		log.info("register");
		mapper.insert(testvo);
		rttr.addFlashAttribute("result", testvo.getNum());
		return "redirect:/tests/list";
		
	}
	
	@GetMapping("/read")
	public void read(@RequestParam("num") Long num , Model model) {
		log.info("read");
		model.addAttribute("test",mapper.read(num));
	}
	
	
}
