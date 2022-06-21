package com.mycompany.convertor;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mycompany.dto.PropertyDTO;
import com.mycompany.entity.PropertyEntity;

@Service
public class PropertyConvertor {

	
	public PropertyEntity convertDTOEntity(PropertyDTO propertyDTO) {

		PropertyEntity pe = new PropertyEntity();
		pe.setTitle(propertyDTO.getTitle());
		pe.setAddress(propertyDTO.getAddress());

		pe.setPrice(propertyDTO.getPrice());
		pe.setDescription(propertyDTO.getDescription());
		return pe;
	}
	
	
	public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity) {
		
		PropertyDTO propertyDTO1 = new PropertyDTO();
		
		propertyDTO1.setId(propertyEntity.getId());
		propertyDTO1.setTitle(propertyEntity.getTitle());
		propertyDTO1.setAddress(propertyEntity.getAddress());

		propertyDTO1.setPrice(propertyEntity.getPrice());
		propertyDTO1.setDescription(propertyEntity.getDescription());
		return propertyDTO1;
		
	}
}
