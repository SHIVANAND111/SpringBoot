package com.tns.order.springwork;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Order {

	
	private int id;
	   private LocalDateTime dateofpurchase;
	   private String paymentMode;
	   private float total;
	   private int customer_id;
	   private int shop_id;
	   
	   
	   
	   
	   
	public Order() {
			}





	public Order(int id, LocalDateTime dateofpurchase, String paymentMode, float total, int customer_id, int shop_id) {
		super();
		this.id = id;
		this.dateofpurchase = dateofpurchase;
		this.paymentMode = paymentMode;
		this.total = total;
		this.customer_id = customer_id;
		this.shop_id = shop_id;
	}



	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public LocalDateTime getDateofpurchase() {
		return dateofpurchase;
	}





	public void setDateofpurchase(LocalDateTime dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}





	public String getPaymentMode() {
		return paymentMode;
	}





	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}





	public float getTotal() {
		return total;
	}





	public void setTotal(float total) {
		this.total = total;
	}





	public int getCustomer_id() {
		return customer_id;
	}





	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}





	public int getShop_id() {
		return shop_id;
	}





	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}





	@Override
	public String toString() {
		return "Order [id=" + id + ", dateofpurchase=" + dateofpurchase + ", paymentMode=" + paymentMode + ", total="
				+ total + ", customer_id=" + customer_id + ", shop_id=" + shop_id + "]";
	}



  


	
	   
	   
	   

}
