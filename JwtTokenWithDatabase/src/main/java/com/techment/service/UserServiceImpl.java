package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.repository.UserRepository;
import com.techment.util.SiteUtil;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository repository;
	
	@Autowired
	SiteUtil siteUtil ;
	
	public UserDto login(String username, String password) {
		
		User user = repository.findByUsernameAndPassword(username, password).get() ;
		String token = siteUtil.generateToken();
		user.setToken(token);
		repository.save(user);
		
		
		UserDto userDto = new UserDto(user.getName(), user.getPassword(), token);
		
		return userDto;
	}

}
