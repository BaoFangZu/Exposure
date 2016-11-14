package com.exposure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
		
		@RequestMapping(method=RequestMethod.GET)
		public Page<House> findHouses(
				@RequestParam(value="limit", required=false, defaultValue="20") int limit, 
				@RequestParam(value="page", required=false, defaultValue="0") int page,
				@RequestParam(value="title", required=false) String title,
				@RequestParam(value="content", required=false) String content,
				@RequestParam(value="direction", required=false, defaultValue="desc") String direction,
				@RequestParam(value="sort", required=false, defaultValue="createTime") String sortAttr
				){
			return houseService.findHouses(title, content, limit, page, direction, sortAttr);
		}
		
		@RequestMapping(value="/page",method=RequestMethod.GET)
		public Page<House> findHousesPageable(
				@RequestParam(value="limit", required=false, defaultValue="20") int limit, 
				@RequestParam(value="page", required=false, defaultValue="1") int page
				){
			return houseService.findHousesPageable(limit, page);
		}
}
