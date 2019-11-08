package org.zerock.service;

import static org.junit.Assert.assertNotNull;

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
public class BoardServiceTests {

	@Setter(onMethod_ = { @Autowired })
	private BoardService service;

	@Test
	public void testExist() {
		log.info("service start");
		assertNotNull(service);
	}

	@Test
	public void testGetListr() {
		log.info("*************************************************************************************");
		service.getList().forEach(board -> {
			log.info(board);
		});
		log.info("*************************************************************************************");
	}

	@Test
	public void testGet() {
		log.info("*************************************************************************************");
		log.info(service.get(8));
		log.info("*************************************************************************************");
	}

//	@Test
//	public void testRegister() {
//		log.info("*************************************************************************************");
//		service.register(new BoardVO("unit테스트 제목1", "unit테스트 내용1", "unit테스트 이름1"));
//		
//		log.info("register 성공");
//		log.info("*************************************************************************************");
//	}
//
//	@Test
//	public void testUpdate() {
//		log.info("*************************************************************************************");
//		log.info(service.modify(new BoardVO(3, "unit테스트 제목99222", "unit테스트 내용99222", "unit테스트 이름99222")));
//		log.info("*************************************************************************************");
//	}
//
//	@Test
//	public void testDelete() {
//		log.info("*************************************************************************************");
//		log.info(service.remove(3));
//		log.info("*************************************************************************************");
//	}

}
