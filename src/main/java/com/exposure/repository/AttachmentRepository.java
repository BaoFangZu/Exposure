package com.exposure.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.exposure.model.Attachment;


public interface AttachmentRepository extends PagingAndSortingRepository<Attachment, Long>{

	List<Attachment> findByHouseId(long houseId);
	
}
