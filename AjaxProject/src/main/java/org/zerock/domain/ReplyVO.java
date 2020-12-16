package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ReplyVO {
		
	private Long rno;
	private String replyer;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date replydate;
	
	
}
