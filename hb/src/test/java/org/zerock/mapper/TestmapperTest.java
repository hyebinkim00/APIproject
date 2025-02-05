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
public class TestmapperTest {
@Setter(onMethod_ =@Autowired)
private TestMapper mapper;
@Test
public void testget() {
	
	mapper.getList().forEach(board-> log.info(board));
}



@Test
public void testread() {
	
	TestVO test = mapper.read(2L);
	log.info(test);
}

@Test
public void test() {
	int cout=mapper.test("홍길동");
	
	log.info(cout);
}

@Test
public void tes1t() {
	int cout=mapper.test1("eff","1234");
	
	log.info("test1:"+cout);
}


}
