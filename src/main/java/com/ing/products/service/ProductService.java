package com.ing.products.service;

import java.util.List;
import java.util.Optional;
import com.ing.products.entity.Product;

public interface ProductService {
	
	public Optional<List<Product>> showproducts(int categoryId);		

}
