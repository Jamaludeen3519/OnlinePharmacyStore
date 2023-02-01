package com.cg.onlinepharmacystore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.cg.onlinepharmacystore.entity.User;
import com.cg.onlinepharmacystore.entity.Products;
import com.cg.onlinepharmacystore.exception.ResourceNotFoundException;
import com.cg.onlinepharmacystore.service.IProductService;




@RestController 
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	
	@PostMapping
	public Products addProducts(@Valid @RequestBody Products product)
	{
		return productService.addProduct( product);
	}
		
	//Get all items to create a menu
	@GetMapping("/ListAll")
	public List<Products> getListAllProducts()
	{
		return productService.getListAllProducts();
	}
	
	@GetMapping("/List/{productId}")
    public Products getProductById(@PathVariable(value = "productId") Long productId)
        throws ResourceNotFoundException {
		return productService.getProductById(productId);
    }
	
	
	@PutMapping("/List/{productId}")
    public Products updateProduct(@PathVariable(value = "productId") Long productId,
         @Valid @RequestBody Products productDetails) throws ResourceNotFoundException
	{
		return productService.updateProduct( productDetails,productId);
    }
	
	//Delete an item according to itemId and vendorId
//	@DeleteMapping("/admin/{adminId}/List/{productId}")
//	public ResponseEntity<?> deleteItem(@PathVariable(value = "adminId") Long adminId, 
//			@PathVariable(value = "productId") Long productId)
//	throws ResourceNotFoundException
//	{
//		return productService.deleteProduct(adminId, productId);
//	}
	
	
}