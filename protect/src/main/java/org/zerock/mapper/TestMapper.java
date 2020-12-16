package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.TestVO;

public interface TestMapper {
	public List<TestVO> getList();
	
	public void insert(TestVO testvo);
	
	public TestVO read(Long num);
	
	public int update(TestVO testvo);
	
}
