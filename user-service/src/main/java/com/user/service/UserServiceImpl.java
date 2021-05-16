package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
			new User(1311L,"Srivenkatesh","8879501944"),
			new User(1312L,"Kiruthika","994244742"),
			new User(1313L,"Hello","9994137652")			
			);

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.list;
	}

}
