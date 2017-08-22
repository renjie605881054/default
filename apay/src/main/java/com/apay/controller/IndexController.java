package com.apay.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apay.dao.IndexDao;
import com.apay.model.ApayUser;

@Controller
public class IndexController {
	
	@Resource
	private IndexDao indexDao;
	
	@RequestMapping(value="index")
	public String index(){
		System.out.println("index...");
		ApayUser user = indexDao.getUser("renjie");
		System.out.println(user.toString());
		return "index";
	}
}
