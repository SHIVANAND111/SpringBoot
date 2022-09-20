package com.tns.order.springwork;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	public List<Order> listAll() {
		
		return  repository.findAll();
	}

	public Order get(Integer id) {
		
		return repository.findById(id).get();
	}

	public void save(Order order) {
		repository.save(order);
		
		
	}

	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
