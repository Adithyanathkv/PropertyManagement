package com.mycompany.service;

import java.util.List;

import com.mycompany.dto.PropertyDTO;

public interface PropertyService {

	public PropertyDTO saveProperty(PropertyDTO propertyDTO);
	public List<PropertyDTO> getAllProperties();
	public PropertyDTO updateProperty(PropertyDTO propertyDTO,Long propertyId);
	public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO,Long propertyId);
	public PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO,Long propertyId);
	public void deleteProperty(Long propertyId);
}
