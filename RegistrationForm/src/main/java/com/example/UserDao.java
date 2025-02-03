package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao implements UserService {

	@Autowired
	UserRepo ur;

	@Override
	public void register(RegisterUser user) {

		ur.save(user);
		
	}
	
	

}
