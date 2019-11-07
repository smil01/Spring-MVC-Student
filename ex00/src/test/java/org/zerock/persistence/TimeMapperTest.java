package org.zerock.persistence;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class TimeMapperTest {
	@Setter(onMethod_ = { @Autowired })
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("1*************************************");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
		log.info("11*************************************");
	}
	
	@Test
	public void testGetTime2() {
		log.info("2*************************************");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime2());
		log.info("22*************************************");
	}
}
