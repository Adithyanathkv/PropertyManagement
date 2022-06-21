package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.dto.PropertyDTO;
import com.mycompany.service.PropertyService;

//@RequestMapping("/api/v1")
@RestController
public class PropertyController {
	
	
	@Autowired
	private PropertyService propertyService;
	
	
	
	@PostMapping("/properties")
	public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO propertyDTO) {
		propertyDTO=propertyService.saveProperty(propertyDTO);
		return new ResponseEntity<PropertyDTO>(propertyDTO,HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/properties")
	public ResponseEntity<List<PropertyDTO>> getAllProperties(){
		return new ResponseEntity<List<PropertyDTO>>(propertyService.getAllProperties(),HttpStatus.ACCEPTED);
	}
	
	
	
	@PutMapping("/properties/{propertyId}")
	public ResponseEntity<PropertyDTO> updateProperty(@RequestBody PropertyDTO propertyDTO,@PathVariable Long propertyId){
		return new ResponseEntity<PropertyDTO>(propertyService.updateProperty(propertyDTO, propertyId),HttpStatus.CREATED);
	}
	
	
	
	@PatchMapping("/properties/update-description/{propertyId}")
	public ResponseEntity<PropertyDTO> updatePropertyDescription(@RequestBody PropertyDTO propertyDTO,@PathVariable Long propertyId){
		
		propertyDTO =propertyService.updatePropertyDescription(propertyDTO, propertyId);
		return new ResponseEntity<PropertyDTO>(propertyDTO,HttpStatus.OK);
	}
	
	
	
	@PatchMapping("/properties/update-price/{propertyId}")
	public ResponseEntity<PropertyDTO> updatePropertyPrice(@RequestBody PropertyDTO propertyDTO,@PathVariable Long propertyId){
		propertyDTO =propertyService.updatePropertyPrice(propertyDTO, propertyId);
		return new ResponseEntity<PropertyDTO>(propertyDTO,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/properties/{propertyId}")
	public String deleteProperty(@PathVariable Long propertyId){
		propertyService.deleteProperty(propertyId);
		return "Property deleted for id "+propertyId;
	}
	
}
