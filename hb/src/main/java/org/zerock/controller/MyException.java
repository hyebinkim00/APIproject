package org.zerock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "Forbidden Error!!!!") 
public class MyException extends RuntimeException { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public MyException() { super("Forbidden Error!!!!"); } }

