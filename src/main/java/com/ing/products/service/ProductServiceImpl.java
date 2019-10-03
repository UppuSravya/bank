package com.ing.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.products.entity.Product;
import com.ing.products.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
		
	@Autowired
	ProductRepository productrepository;
	
	
	public Optional<List<Product>> showproducts(int categoryId) {
		
		return productrepository.findAllByProductCategoryId(categoryId);
	}

}
