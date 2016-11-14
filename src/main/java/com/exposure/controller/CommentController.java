package com.exposure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exposure.model.Comment;
import com.exposure.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(method=RequestMethod.POST)
	public Comment postComment(@RequestBody Comment comment){
		return commentService.postComment(comment);
	}
}
