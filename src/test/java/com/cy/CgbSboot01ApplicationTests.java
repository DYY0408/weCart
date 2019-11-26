package com.cy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pj.common.cache.DefaultCache;
@RunWith(SpringRunner.class)
@SpringBootTest//将测试类交给spring管理
public class CgbSboot01ApplicationTests {
	@Autowired
	private AnnotationConfigApplicationContext ctx;
	@Autowired
	private DefaultCache cache;
	@Test
	public void testCtx() {
		System.out.println(ctx);
	}
	@Test
	public void testDefaultCache() {
		System.out.println(cache);
	}
}
