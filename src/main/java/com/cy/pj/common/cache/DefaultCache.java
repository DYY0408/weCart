package com.cy.pj.common.cache;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
//@Lazy(true)
@Component
public class DefaultCache {
	public DefaultCache() {
		System.out.println("DefaultCache()");
	}
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}









