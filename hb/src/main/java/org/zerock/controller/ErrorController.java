package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


import com.google.gson.JsonObject;

import lombok.extern.log4j.Log4j;
@Log4j
@ControllerAdvice
public class ErrorController {

@ExceptionHandler(Exception.class)

public @ResponseBody String exception(Exception e) {         

	JsonObject obj =new JsonObject();
	
	obj.addProperty("name", e.getClass().getSimpleName());
	obj.addProperty("message", e.getMessage());
	String res=e.getClass().getSimpleName();
	log.info(res);
	if(res.equals("NullPointerException")) {
		obj.addProperty("result", "Null is impossible");
	}
	else if(res.equals("HttpMessageNotReadableException"))
	{
	
	obj.addProperty("result", "A grammatical error occurred.");}
	
	else {
		obj.addProperty("result","405");
	}
   log.info(obj);
  



    return obj.toString();

}


@ExceptionHandler(Throwable.class)
public String handleAnyException(Throwable ex, HttpServletRequest request) {
  return ClassUtils.getShortName(ex.getClass());
}

}
