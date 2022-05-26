package com.keycloak.example.controller;



import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keycloak.example.model.Product;
import com.keycloak.example.service.ProductService;

@RestController
public class ProductController 

{
	@Autowired
	private ProductService service;
	@RolesAllowed("admin")
	@RequestMapping("/home")
	public String home()
	{
		return "welcome to home";
	}
@RolesAllowed("user")
@RequestMapping("/welcome")
public String welcome()
{
	return "welcome to keycloak";
	}

@RolesAllowed("admin")
@RequestMapping("/add")
public String create(@RequestParam int id, @RequestParam String productname)
{
	Product prd= service.create(id, productname);
	return prd.toString();
}
//	@GetMapping("/logout")
//	public String logout(HttpServletRequest request) throws ServletException
//	{
//		request.logout();
//		return "/";
//	}
}

