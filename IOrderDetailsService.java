package com.cg.onlinepharmacystore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.onlinepharmacystore.entity.OrderDetails;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;

public interface IOrderDetailsService {
	
	public OrderDetails orderDetails(String orderId,OrderDetails orderDetail) throws ResourceNotFoundException;
	public List<OrderDetails> getAllOrderDetailsByOrderId(String orderId);
	public List<OrderDetails> getOrderDetailsByAdminId(Long adminId);
	   public ResponseEntity<OrderDetails> updateAdmin(Long orderDetailId,
		         OrderDetails orderDetail) throws ResourceNotFoundException ;

}
