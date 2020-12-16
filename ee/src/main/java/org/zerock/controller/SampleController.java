package org.zerock.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleVO;
import org.zerock.service.MemberService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@GetMapping(value="/getSample", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	
	public SampleVO getSample() {
		return new SampleVO(112,"스타","로드");
	}
	
	



	@GetMapping(value="/getmapping")
	public @ResponseBody SampleDTO ex06() {
		
		log.info(",,,,");
		
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		return dto;
		
	}
	
	
}
