package com.furnitureshop.Furniture.Service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.sailesh.model.Employee;
//import com.example.sailesh.repository.EmployeeRepository;
import com.furnitureshop.Furniture.Repository.FurnitureRepository;
import com.furnitureshop.Furniture.model.Furniture;

@Service
public class FurnitureService {
	@Autowired
	private FurnitureRepository furnitureRepository;

//	public Furniture getFurnitureById(Long furnitureId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Map<String, Boolean> deleteFurniture(Long furnitureId){
		Optional<Furniture> furniture = furnitureRepository.findById(furnitureId);
		System.out.println("inside service");
		System.out.println(furniture.get());
		
		return (Map<String, Boolean>) furniture.get();
	}
	public Furniture getFurnitureById(Long furnitureId) {
		Optional<Furniture> furniture = furnitureRepository.findById(furnitureId);
		System.out.println("-----------inside service----------");
		System.out.println(furniture.get());
		
		return furniture.get();
	}

}
