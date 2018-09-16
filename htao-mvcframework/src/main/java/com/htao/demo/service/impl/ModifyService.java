package com.htao.demo.service.impl;

import com.htao.demo.service.IModifyService;
import com.htao.mvcframework.annotation.GPService;

@GPService("aa")
public class ModifyService implements IModifyService{

	@Override
	public String add(String name, String addr) {
		return "invork add name = " + name + ",addr=" + addr;
	}

	@Override
	public String remove(Integer id) {
		return "invork remove id = " + id;
	}

}
