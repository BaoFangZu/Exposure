package com.exposure.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.exposure.model.Comment;
import com.exposure.repository.CommentRepository;
import com.exposure.util.PageRequestFactory;

@Service
public class CommentService {

	private static final  String TIME_SORT = "createTime";
	private static final  String ID_SORT = "id";
	
	@Autowired
	private CommentRepository commentRepo;
	
	@Autowired
	private PageRequestFactory pageRequestFactory;
	
	public Comment postComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepo.save(comment);
	}

	public Page<Comment> getComments(int limit, int page, long targetId) {
		// TODO Auto-generated method stub
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, TIME_SORT));
		orders.add(new Order(Direction.ASC, ID_SORT));
		Pageable pageReq = pageRequestFactory.createPageRequest(limit, page, orders);
		return commentRepo.findByTargetId(targetId, pageReq);
		//return commentRepo.findAll(pageReq);
	}

	public void deleteComment(long id) {
		// TODO Auto-generated method stub
		commentRepo.delete(id);
	}
}
