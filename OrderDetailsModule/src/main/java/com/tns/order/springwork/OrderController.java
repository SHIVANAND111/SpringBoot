package com.tns.order.springwork;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrderController {
	
	
	@Autowired
	private OrderService service;
	
	//Retrieve All the rows from Database
	@GetMapping("/order")
	public List<Order> list()
	{
		return service.listAll();
	}
	//Retrieve Specific Records from database
		@GetMapping("/order/{id}")
		public ResponseEntity<Order> get (@PathVariable Integer id)
		{
			Order order=service.get(id);
			return new ResponseEntity<Order>(order, HttpStatus.OK);
		}
		//CREATE a row in database
		@PostMapping("/order")
		public void add(@RequestBody Order order)
		{
			service.save(order);
		}
		//Update Operation-record in database
		@PutMapping("/order/{id}")
		public ResponseEntity<?> update(@RequestBody Order order,@PathVariable Integer id)
		{
			try 
			{
				Order existOrder=service.get(id);
				service.save(order);
				return new ResponseEntity<Order>(order, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		// Delete OPeration
		@DeleteMapping("/order/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
	}

