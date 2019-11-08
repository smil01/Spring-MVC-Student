package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = { @Autowired })
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		log.info("*************************************************************************************");
//		mapper.getList().forEach(board -> {
//			log.info(board);
//		});
//		log.info("*************************************************************************************");
//	}
//	
//	@Test
//	public void testInsert() {
//		log.info("*************************************************************************************");
//		mapper.insert(new BoardVO("unit테스트 제목1", "unit테스트 내용1", "unit테스트 이름1"));
//		
//		log.info("insert 성공");
//		log.info("*************************************************************************************");
//	}
//	
//	@Test
//	public void testinsertSelectKey() {
//		log.info("*************************************************************************************");
//		mapper.insertSelectKey(new BoardVO("unit테스트 제목1", "unit테스트 내용1", "unit테스트 이름1"));
//		
//		log.info("insertSelectKey 성공");
//		log.info("*************************************************************************************");
//	}
//	
//	@Test
//	public void testRead() {
//		log.info("*************************************************************************************");
//		log.info(mapper.read(8));
//		log.info("*************************************************************************************");
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("*************************************************************************************");
//		log.info(mapper.delete(1));
//		log.info("*************************************************************************************");
//	}
//	
//	@Test
//	public void testUpdate() {
//		log.info("*************************************************************************************");
//		log.info(mapper.update(new BoardVO(2, "unit테스트 제목99", "unit테스트 내용99", "unit테스트 이름99")));
//		log.info("*************************************************************************************");
//	}
}
