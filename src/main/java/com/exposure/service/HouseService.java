package com.exposure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exposure.model.House;
import com.exposure.repository.ArticleRepository;
import com.exposure.repository.HouseRepository;

@Service
public class HouseService {
	
	@Autowired
	HouseRepository houseRepo;

	@Autowired
	ArticleRepository articleRepo;
	
	public House addHouse(House house) {
		// TODO Auto-generated method stub
		//articleRepo.save(house.getArticle());
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
