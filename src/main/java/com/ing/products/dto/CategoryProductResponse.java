package com.ing.products.dto;

import java.util.List;

import com.ing.products.entity.Product;

public class CategoryProductResponse {
	
	List<Product> product;
	String statusCode;
	String message;
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
