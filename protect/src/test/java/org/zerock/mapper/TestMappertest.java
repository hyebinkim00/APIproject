package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.TestVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class TestMappertest {
@Setter(onMethod_ =@Autowired)
	private TestMapper mapper;

@Test
public void testlist() {
	mapper.getList().forEach(test->log.info(test));
	
}

/*
 * @Test public void testInsert() { TestVO test = new TestVO();
 * test.setId("테스트2"); test.setPwd("1234"); mapper.insert(test);
 * log.info("insert"); }
 */

/*
 * @Test public void testRead() { TestVO test= mapper.read(2L); log.info(test);
 * 
 * }
 */

@Test
public void testUpdate() {
	TestVO test = new TestVO();
	test.setNum(2L);
	test.setId("수정된 이름");
	test.setPwd("4321");
	int count= mapper.update(test);
	log.info("Update Count: "+count);
}

}
