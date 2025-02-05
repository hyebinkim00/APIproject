package org.zerock.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.zerock.domain.TestVO;
import org.zerock.mapper.TestMapper;

import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/test/*")
@AllArgsConstructor
public class TestController{
	private TestMapper mapper;
	
@GetMapping(value="/list" ,produces = "application/json; charset=UTF-8")
	public @ResponseBody String list(Model model) {
	log.info("list");
	model.addAttribute("list",mapper.getList());
	log.info(model);
	return model.toString();
}

@ResponseBody
@RequestMapping(value="/intro", method= RequestMethod.POST ,produces = "application/json; charset=UTF-8")
public String read(@RequestBody HashMap<String, HashMap<String, String>> requestData){
	log.info("read");

    HashMap<String, String> login = requestData.get("TestVO");
    String id=login.get("id");
    String pwd=login.get("pwd");
    int cont = mapper.test1(id,pwd);
    log.info(cont);
    JsonObject result =new JsonObject();
    JsonObject obj= new JsonObject();
    
    
    if(id.length()>=4 && pwd.length()>=4 && cont==1) {
    	
    	
    	
    	obj.addProperty("state","200");
    	obj.addProperty("message","정상적으로 처리하였습니다.");
    	
    	result.addProperty("packageName","localhost:8080");
    	result.addProperty("login","login success");
    	obj.add("result",result);
    	
    }else {
    obj.addProperty("state","200");
    obj.addProperty("message","유효성 검증 오류");
    result.addProperty("packageName","localhost:8080");
	result.addProperty("login","login fail");
	
	if(id.length()<4) {
		result.addProperty("cause","아이디 검증 실패");}
	else if(pwd.length()<4) {
		result.addProperty("cause","비밀번호 검증 실패");
	}else {
		result.addProperty("cause","정보가 일치하지 않습니다.");
	}
    
    }
    obj.add("result",result);
    
    return obj.toString();
	
	
}



@GetMapping(value="/getSample")

public @ResponseBody TestVO getSample() {
	TestVO testvo= new TestVO();
	testvo.setUserid("테스트7");
	testvo.setPasswd("1234");
	testvo.setUsernum((long) 7);
	mapper.insert(testvo);
	return testvo;
}

@ResponseBody
@RequestMapping(value="/members", method=RequestMethod.GET)


public ResponseEntity<List<TestVO>> list() {
log.info("all ");
	
    ResponseEntity<List<TestVO>> entity = null;
	

    try {
        entity = new ResponseEntity<>(
            mapper.getList(), HttpStatus.OK);
        
        
    } catch (Exception e) {
        e.printStackTrace();
        entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }	
    	
    	
    log.info(entity);
    
    return entity;
}

@ResponseBody
@RequestMapping(value="/find/{usernum}",method=RequestMethod.POST)
public TestVO getUser(@PathVariable("usernum")Long usernum) {
	TestVO find =mapper.read(usernum);
	return  find;
}




}
