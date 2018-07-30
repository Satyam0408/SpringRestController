package com.practice.springEg.Jarvis;	

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalDetails {

	@RequestMapping("/names")
	private List <String> NamesList(){
	List<String> list = new ArrayList<String>();
	
	list.add("Sam");
	list.add("Ram");
	list.add("Xyf");
	
	return list;
	}
	
	@RequestMapping("/detailsById")
	private Employee detailsById(@RequestParam int id){
		Employee employee = new Employee();
		employee.setId(10);
		employee.setAddress("Home");
		employee.setName("YYY");
		employee.setPan(31414);
		return employee;
	

	}
}
