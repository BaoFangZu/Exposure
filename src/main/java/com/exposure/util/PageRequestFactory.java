package com.exposure.util;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

@Component
public class PageRequestFactory {
	public Pageable createPageRequest(int limit, int page, List<Order> orders){
		Sort sort = new Sort(orders);
		PageRequest onePage = new PageRequest(page, limit, sort);
		return onePage;
	}
}
