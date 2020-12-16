package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.zerock.domain.TestVO;

public interface TestMapper {

	//@Select("select * from user")
	public List<TestVO> getList();
	
	public void insert(TestVO test);
	
	public TestVO read(Long usernum);
	
	public int test(String userid);
	
	public int test1(@Param("userid")String userid,@Param("passwd")String passwd);
}
