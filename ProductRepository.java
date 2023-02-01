package com.cg.onlinepharmacystore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinepharmacystore.entity.Products;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;


@Repository //marks this interface as repository 
public interface ProductRepository  extends JpaRepository<Products, Long> {
	
	//select * from vegetable where vegetable_name = ?
//	public Products findByProductName(String product_Name);
	


}
