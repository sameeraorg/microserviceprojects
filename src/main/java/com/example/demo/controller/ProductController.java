package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
@RestController
public class ProductController {	
	@Autowired
	private ProductService ProductService;
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getProducts() {
	 List<Product> listOfProducts = ProductService.getAllProducts();
	 return listOfProducts;
		 }

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Product getProductById(@PathVariable int id) {
	 return ProductService.getProduct(id);
	 }
	
	 @RequestMapping(value = "/products", method = RequestMethod.POST, headers = "Accept=application/json")
	 public Product addProduct(@RequestBody Product product) {
	 return ProductService.addProduct(product);
	 }
	 
	 @RequestMapping(value = "/products", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public Product updateProduct(@RequestBody Product product) {
	 return ProductService.updateProduct(product);
	 }
	 @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteProduct(@PathVariable("id") int id) {
		 ProductService.deleteProduct(id); 
	 }


}
