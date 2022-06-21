package com.mycompany.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dto.UserDTO;
import com.mycompany.repository.UserRepository;
import com.mycompany.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO register(UserDTO userDTO) {
//		userRepository.save()
		return null;
	}

	@Override
	public UserDTO login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
