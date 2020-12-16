package org.zerock.mapper;

import java.util.List;


import org.zerock.domain.MemberVO;

public interface TestMapper {
	public void insertMember(MemberVO vo);
	
	//@Select("select * from user")
	public List<MemberVO> getList();
}
