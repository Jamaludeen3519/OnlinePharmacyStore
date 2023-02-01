package com.cg.onlinepharmacystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinepharmacystore.repository.ProductRepository;
import com.cg.onlinepharmacystore.entity.Products;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;
//import com.cg.onlinepharmacystore.service.IproductService;


@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public Products addProduct(Products product) {
		return productRepo.save(product);
	}
	
	@Override
	public List<Products> getListAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Products getProductById(Long proId) throws ResourceNotFoundException {
		return productRepo.findById(proId)
				.orElseThrow(() -> new ResourceNotFoundException("Product Not found"));
	}

	@Override
	public Products updateProduct(Products product, Long productId) throws ResourceNotFoundException {
		Products existingProduct = productRepo.findById(productId)
													.orElseThrow(() -> new ResourceNotFoundException("Product Not found"));
	
		existingProduct.setProduct_Name(product.getProduct_Name());
		existingProduct.setProduct_Price(product.getProduct_Price());
//		existingProduct.setProduct_Category(pro.getProduct_Category());
		productRepo.save(existingProduct);
		return existingProduct;
	}



//	@Override
//	public Products findByProductName(String product_Name) throws ResourceNotFoundException {
//		return productRepo.findByProductName(product_Name);
//	}

//	@Override
//	public List<products> findByProductCategory(String proCategory) throws ResourceNotFoundException{
//		return productRepo.findByProductCategory(proCategory);
//	}
		
}


