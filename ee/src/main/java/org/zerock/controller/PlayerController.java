package org.zerock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController{
	@RequestMapping("/restTest")
	public String restTest(@RequestParam String str) {
		return str+" : REST 완료 !~!";
	}
	
}