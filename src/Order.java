package com.cg.onlinepharmacystore.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "orders")
public class Order{
	
	@Id
	@Column(name="order_id")
	private String orderId;
	
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "orderStatus")
	private String orderStatus;
	
	@Column(name = "order_date")
	private Date orderDate;


	public Order() {
		super();
	}
	
	

	public Order(String orderId, Long userId, double amount, String orderStatus, Date orderDate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.amount = amount;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}






	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long customerId) {
		this.userId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String status) {
		this.orderStatus = status;
	}

	
	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + userId + ", amount=" + amount + ", status=" + orderStatus
				+ ", orderDate=" + orderDate + "]";
	}

	


	


	
	
	
	
}
