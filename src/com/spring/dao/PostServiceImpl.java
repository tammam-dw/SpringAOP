package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("postServiceImpl")
public class PostServiceImpl implements PostService {

	@Override
	public void allPosts() {
		System.out.println("my posts-----service");
		
	}

}
