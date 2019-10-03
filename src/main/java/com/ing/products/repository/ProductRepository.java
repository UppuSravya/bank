
package com.ing.products.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ing.products.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Optional<List<Product>> findAllByCategoryId(int categoryId);

}
