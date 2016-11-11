package com.exposure.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.exposure.model.House;


public interface HouseRepository extends PagingAndSortingRepository<House, Long> {

    
    //@Query("Select a.id,a.first_name,a.last_name from user a  left join pets b on a.id=b.owner")
    //public List<User> findAllWithPets();
}