package com.keycloak.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Product 
{
	@Id
	private String productname;
	private int id;
	
	public Product() {
		super();
	}
	public Product(String productname, int id) {
		super();
		this.productname = productname;
		this.id=id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", id=" + id + "]";
	}
	
	
}
