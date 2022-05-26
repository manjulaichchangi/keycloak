package com.keycloak.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keycloak.example.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,String> {

	public Product save(Product prd);

	public Product findById(int id);

}
