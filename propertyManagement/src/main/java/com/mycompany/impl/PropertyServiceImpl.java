package com.mycompany.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.convertor.PropertyConvertor;
import com.mycompany.dto.PropertyDTO;
import com.mycompany.entity.PropertyEntity;
import com.mycompany.repository.PropertyRepository;
import com.mycompany.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {
	
	//================================================================================================================
	@Autowired
	private PropertyRepository propertyRepository;

	@Autowired
	private PropertyConvertor propertyConvertor;
	
	//=================================================================================================================
	
	
	
	@Override
	public PropertyDTO saveProperty(PropertyDTO propertyDTO){
		
		PropertyEntity pe = propertyConvertor.convertDTOEntity(propertyDTO);
		pe = propertyRepository.save(pe);
		
		 propertyDTO =propertyConvertor.convertEntityToDTO(pe);
		return propertyDTO;
	}


	
	@Override
	public List<PropertyDTO> getAllProperties() {
		List<PropertyEntity> listOProps=(List<PropertyEntity>)propertyRepository.findAll();
		
		List<PropertyDTO> proplist = new ArrayList<>();
		
		for(PropertyEntity pe : listOProps) {
			PropertyDTO dto =propertyConvertor.convertEntityToDTO(pe);
			proplist.add(dto);
		}
		return proplist;
		
	}


	
	@Override
	public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId) {
		
		Optional<PropertyEntity> optEn = propertyRepository.findById(propertyId);
		PropertyDTO dto = null;
		
		if(optEn.isPresent()) {
			
			PropertyEntity pe = optEn.get();
			pe.setTitle(propertyDTO.getTitle());
			pe.setAddress(propertyDTO.getAddress());
			pe.setPrice(propertyDTO.getPrice());
			pe.setDescription(propertyDTO.getDescription());
			
			dto= propertyConvertor.convertEntityToDTO(pe);
			propertyRepository.save(pe);	
		}
		return dto;
	}


	
	
	
	

	@Override
	public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId) {
		Optional<PropertyEntity> optEn = propertyRepository.findById(propertyId);
		PropertyDTO dto = null;
		
		if(optEn.isPresent()) {
			PropertyEntity pe = optEn.get();
			pe.setDescription(propertyDTO.getDescription());
			
			dto= propertyConvertor.convertEntityToDTO(pe);
			propertyRepository.save(pe);	
		}
		return dto;
	}


	
	
	

	@Override
	public PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO, Long propertyId) {
		Optional<PropertyEntity> optEn = propertyRepository.findById(propertyId);
		PropertyDTO dto = null;
		
		if(optEn.isPresent()) {
			PropertyEntity pe = optEn.get();
			pe.setPrice(propertyDTO.getPrice());
			
			dto= propertyConvertor.convertEntityToDTO(pe);
			propertyRepository.save(pe);	
		}
		return dto;
	}



	@Override
	public void deleteProperty(Long propertyId) {
		propertyRepository.deleteById(propertyId);
		}

	
	
	
	
}
