package com.exposure.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.exposure.model.Comment;
import com.exposure.model.House;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    //@Query("Select a.id,a.first_name,a.last_name from user a  left join pets b on a.id=b.owner")
    //public List<User> findAllWithPets();
	
	public Page<Comment> findByTargetId(long targetId, Pageable onePage);
}