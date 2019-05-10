package com.mumu.houserent.user.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.mumu.houserent.user.repository.entity.UserEntity;

@Repository
public class UserRepository {
	
	private Map<Integer, UserEntity> users;

	@PostConstruct
	public void init() {
		users = new LinkedHashMap<>();
	}
	
	public int size() {
		return users.size();
	}
	
	public UserEntity add(UserEntity user) {
		int id = size() + 1;
		user.setId(id);
		users.put(id, user);
		return user;
	}
	
	public UserEntity findBy(UserEntity user) {
		int id = size() + 1;
		user.setId(id);
		users.put(id, user);
		return user;
	}
}
