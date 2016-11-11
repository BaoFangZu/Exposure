package com.exposure.service;

import org.springframework.stereotype.Service;

import com.exposure.model.House;
import com.exposure.repository.HouseRepository;

@Service
public class HouseService {
	
	HouseRepository houseRepo;

	public House addHouse(House house) {
		// TODO Auto-generated method stub
		return houseRepo.save(house);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		houseRepo.delete(id);
	}

	public Iterable<House> findAll() {
		// TODO Auto-generated method stub
		return houseRepo.findAll();
	}

	public House findOne(long id) {
		// TODO Auto-generated method stub
		return houseRepo.findOne(id);
	}

}
