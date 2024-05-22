package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("postDaoImpl")
public class PostDaoImpl implements BossDao {

	@Override
	public void allPosts() {
			
		System.out.println("my posts------postDao");
		
	}

	public String allLikes() {
		// TODO Auto-generated method stub
		return "Post Dao Servie likes";
	}

}
