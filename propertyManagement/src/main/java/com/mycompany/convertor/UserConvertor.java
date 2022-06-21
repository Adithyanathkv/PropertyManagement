package com.mycompany.convertor;

import org.springframework.stereotype.Component;

import com.mycompany.dto.UserDTO;
import com.mycompany.entity.UserEntity;

@Component
public class UserConvertor {

	public UserEntity convertUserDTOtoEnity(UserDTO userDTO) {
		
		
		UserEntity userEntity = new UserEntity();
		userEntity.setOwnerEmail(userDTO.getOwnerEmail());
		userEntity.setOwnerName(userDTO.getOwnerName());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPhone(userDTO.getPhone());
		
		return userEntity;
		
	}
	
	
public UserDTO convertUserEnitytoDTO(UserEntity userEntity) {
		
		
		UserDTO userDTO = new UserDTO();
		userDTO.setOwnerEmail(userEntity.getOwnerEmail());
		userDTO.setOwnerName(userEntity.getOwnerName());
		userDTO.setPassword(userEntity.getPassword());
		userDTO.setPhone(userEntity.getPhone());
		
		return userDTO;
		
	}
	
	
	
	
}
