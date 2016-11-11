package com.exposure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exposure.model.House;
import com.exposure.service.HouseService;

@RestController
@RequestMapping("/houses")
public class UserController {

		@Autowired
		HouseService houseService;
		
		@RequestMapping(method=RequestMethod.POST)
		public House addUser(@RequestBody House user){
			return houseService.addUser(user);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
		public void delUser(@PathVariable long id){
			houseService.delete(id);
		}
		
		@RequestMapping(value="/all", method=RequestMethod.GET)
		public Iterable<House> findAllUsers(){
			return houseService.findAll();
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public House findOne(@PathVariable long id){
			return houseService.findOne(id);
		}
}
