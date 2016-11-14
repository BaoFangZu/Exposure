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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "评论管理")
@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@ApiOperation("发表一条评论")
	@RequestMapping(method=RequestMethod.POST)
	public Comment postComment(@RequestBody Comment comment){
		return commentService.postComment(comment);
	}
	
	@ApiOperation("分页获取评论")
	@RequestMapping(method=RequestMethod.GET)
	public Page<Comment> getComments(
			@RequestParam(value="limit", required=false, defaultValue="20") int limit, 
			@RequestParam(value="page", required=false, defaultValue="0") int page
			){
		return commentService.getComments(limit, page);
	}
	
	@ApiOperation("删除一条评论")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteCommet(@PathVariable long id){
		commentService.deleteComment(id);
	}
	
}
