package com.exposure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.exposure.model.House;
import com.exposure.repository.HouseRepository;

@Service
public class HouseService {
	
	@Autowired
	HouseRepository houseRepo;
	
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
	
	public Page<House> findHouses(
			String title, String content, 
			int limit, int page, 
			String dir, String sortAttr){
		
		Direction direction = Direction.DESC;
		
		if (dir.equalsIgnoreCase("asc")){
			direction = Direction.ASC;
		}
		
		Page<House> houses = null;
		Pageable onePage = createPageRequest(limit, page, direction, sortAttr);
		
		if (title==null && content==null) {
			houses = houseRepo.findAll(onePage);
		} else {
			houses = houseRepo.findByTitleOrContent(title, content, onePage);
		}
		return houses;
	}
	
	public Page<House> findHousesPageable(int limit, int page){
		PageRequest onePage = new PageRequest(page, limit);
		Page<House> houses = houseRepo.findAll(onePage);
		return houses;
	}

	private Pageable createPageRequest(int limit, int page, Direction dir, String attr){
		Sort sort = new Sort(dir, attr);
		PageRequest onePage = new PageRequest(page, limit, sort);
		return onePage;
	}
}
