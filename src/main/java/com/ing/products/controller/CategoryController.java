package com.ing.products.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.products.dto.CategoryProductResponse;
import com.ing.products.entity.Product;
import com.ing.products.service.ProductService;


@RestController
public class CategoryController {

	@Autowired
	ProductService productService;
		
	@PostMapping(value="/category/{categoryId}")
	public CategoryProductResponse selectCategory(@PathVariable int categoryId){
		Optional<List<Product>> productlist = productService.showproducts(categoryId);
		List<Product> products = new ArrayList();
		List<Product> p = productlist.get();
		
		if(!productlist.isPresent()){	
			CategoryProductResponse categoryResponse = new CategoryProductResponse();
			categoryResponse.setMessage("Category doesnt exist");
			categoryResponse.setStatusCode("400");
	        return  categoryResponse;
		} else {
			CategoryProductResponse categoryResponse = new CategoryProductResponse();
			categoryResponse.setProduct(p);
			categoryResponse.setMessage("Success");
			categoryResponse.setStatusCode("200");
            return  categoryResponse;
		}
	}
}
	

