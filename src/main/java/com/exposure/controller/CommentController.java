package com.exposure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(method=RequestMethod.GET)
	public Page<Comment> getComments(
			@RequestParam(value="limit", required=false, defaultValue="20") int limit, 
			@RequestParam(value="page", required=false, defaultValue="0") int page
			){
		return commentService.getComments(limit, page);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteCommet(@PathVariable long id){
		commentService.deleteComment(id);
	}
	
}
