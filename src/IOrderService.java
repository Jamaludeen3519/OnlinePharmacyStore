package com.cg.onlinepharmacystore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.onlinepharmacystore.entity.Order;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;

public interface IOrderService {
	public Order saveOrder(Order order);
	public List<Order> getAllOrders();
	public ResponseEntity<Order> updateOrder(String orderId,Order orderDetails) throws ResourceNotFoundException;
	public ResponseEntity<?> deleteOrder(String orderId) throws ResourceNotFoundException;
	public ResponseEntity<Order> getOrderById(String orderId)throws ResourceNotFoundException;
}
