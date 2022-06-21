package com.mycompany.service;

import com.mycompany.dto.UserDTO;

public interface UserService {

	public UserDTO register(UserDTO userDTO);
	public UserDTO login(String email,String password);
}
