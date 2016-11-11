package com.exposure.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exposure.model.House;
import com.exposure.repository.HouseRepository;

@Service
public class HouseService {
	
	HouseRepository houseRepo;

	public House addUser(House user) {
		// TODO Auto-generated method stub
		return houseRepo.save(user);
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
