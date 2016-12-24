package com.zccpro.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zccpro.dao.UserMapper;
import com.zccpro.domain.User;
import com.zccpro.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-config.xml"})  
public class SpringMybatisTest {
	private static Logger logger = Logger.getLogger(SpringMybatisTest.class); 
	
	@Resource
	private UserMapper mapper;
	@Resource
	private UserService userService;
	@Test
	public void test1(){
		User user = mapper.selectByPrimaryKey(10);
		User selectUser = userService.selectUser(10);
		logger.info("UserName"+user.getUsername());
		System.out.println("aa");
		String string = new String();
	
	}
	
	
}
