package com.imooc.o2o;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 告诉junit 我们用什么类去跑
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})// 告诉junit spring 配置文件的位置
@Ignore
public class BaseTest {
	
}
