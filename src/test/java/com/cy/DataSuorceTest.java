package com.cy;


import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 测试HiKari连接池*/
@RunWith(SpringRunner.class)
@SpringBootTest //将测试类交给spring管理
public class DataSuorceTest {

	@Autowired
	DataSource dataSource;
	
	@Test
	public void testDataSource() throws Exception {
		System.out.println("连接对象"+dataSource.getConnection());
	}
}
