package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Address;
import com.example.dto.User;
import com.example.exceptions.MyCustomException;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("insdie UserController constr....");
	}
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable String id) {
		
		System.out.println("inside getUser Usercontroller...");
		
		User user = userService.getUserById(id);
		
		if(user == null) {
			throw new MyCustomException(id);
		}
//		
//		Address address = restTemplate.getForObject("http://localhost:8081/address/studentId/"+id, Address.class);
//		//Address address = restTemplate.getForObject("http://address-service/address/studentId/"+id, Address.class);
//		
//		user.setAddress(address);
		return user;
	}

}
