package com.exposure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exposure.model.House;
import com.exposure.service.HouseService;

@RestController
@RequestMapping("/houses")
public class HouseController {

		@Autowired
		HouseService houseService;
		
		@RequestMapping(method=RequestMethod.POST)
		public House addHouse(@RequestBody House house){
			return houseService.addHouse(house);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
		public void delHouse(@PathVariable long id){
			houseService.delete(id);
		}
		
		@RequestMapping(value="/all", method=RequestMethod.GET)
		public Iterable<House> findAllHouses(){
			return houseService.findAll();
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public House findOne(@PathVariable long id){
			return houseService.findOne(id);
		}
}
