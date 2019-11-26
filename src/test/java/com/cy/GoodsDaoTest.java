package com.cy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pj.dao.GoodsDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsDaoTest {

	@Autowired
	GoodsDao dao;
	
	@Test
	public void testDeleteGoods() {
		int row = dao.deleteGoods(2);
		System.out.println(row);
	}
	
	//多id删除
	@Test
	public void testDeleteObject() {
		int rows = dao.deleteObjects(2,3);
		System.out.println(rows);
	}
}
