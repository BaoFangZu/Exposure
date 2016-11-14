package com.exposure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exposure.model.Comment;
import com.exposure.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository commentRepo;
	
	public Comment postComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepo.save(comment);
	}
}
