package com.cy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cy.pj.common.cache.DefaultCache;

@SpringBootApplication //对本类所在包以及子包中的类进行自动扫描
public class CgbSboot01Application implements CommandLineRunner{
	
	
	/** 内置tomcat启动服务器 */
	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}
	@Autowired
    private DefaultCache cache;
	public void doPrintCache() {
		System.out.println("cache="+cache);
	}
	@Override
	public void run(String... args) throws Exception {
        System.out.println("args.length="+args.length);		
	    doPrintCache();
	}
	
	
	

}
