package com.cg.onlinepharmacystore.service;

import java.util.*;

import org.springframework.http.ResponseEntity;
import com.cg.onlinepharmacystore.entity.Products;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;




public interface IProductService {


	public Products addProduct(Products product);
	public List<Products> getListAllProducts();
	public Products getProductById(Long productId) throws ResourceNotFoundException;
	public Products updateProduct(Products pro,Long productId) throws ResourceNotFoundException;
//	public Products findByProductName(String product_Name) throws ResourceNotFoundException;
}
