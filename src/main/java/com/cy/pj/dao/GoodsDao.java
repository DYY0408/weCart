package com.cy.pj.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/** dao层，数据处理*/
@Mapper  //标识dao
public interface GoodsDao {

	@Delete("delete from tb_goods where id=#{id}")
	int deleteGoods(Integer id);
	
	/** 当sql语句比较麻烦的时候，配置mapper.xml文件*/
	int deleteObjects(@Param("ids")Integer...ids);
}
