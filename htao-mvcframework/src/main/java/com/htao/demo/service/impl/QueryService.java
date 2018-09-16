package com.htao.demo.service.impl;

import com.htao.demo.service.IQueryService;
import com.htao.mvcframework.annotation.GPService;

@GPService
public class QueryService implements IQueryService {

	@Override
	public String search(String name) {
		return "invork search name = " + name;
	}

}
