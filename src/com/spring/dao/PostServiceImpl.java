package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("postServiceImpl")
public class PostServiceImpl implements PostService {

	@Override
	public String allPosts() {
		
		System.out.println("my posts-----service");
		return " PostServiceImpl ";
	}

}
