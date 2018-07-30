package com.practice.springEg.Jarvis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficialDetails {
	@RequestMapping("/roles")
	private List <String> NamesList(){
	List<String> list = new ArrayList<String>();
	
	list.add("Executive Decisions");
	list.add("Marketing");
	list.add("Sales");
	
	return list;
	}
	
	@RequestMapping("/JobId")
	private Employee detailsById(@RequestParam int id){
		Employee employee = new Employee();
		employee.setId(10641285);
		employee.setAddress("L&T infotech, Pune");
		employee.setName("Bihari Lal Monga");
		employee.setPan(000000);
		return employee;
	

	}

}
