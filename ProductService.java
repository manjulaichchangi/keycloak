package com.keycloak.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.keycloak.example.model.Product;
import com.keycloak.example.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	public Product create( int id, String productname)
	{
		return repo.save(new Product());
	}
	
	public Product findById(int id)
	{
		return repo.findById(id);
	}
	
	public List<Product> listAll()
	{
		return (List<Product>) repo.findAll();
	}
}
