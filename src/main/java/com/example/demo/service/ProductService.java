package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;



@Service
public class ProductService {
	static HashMap<Integer,Product>productIdMap=getproductIdMap();
	
	public ProductService() {
		super();
	
	if(productIdMap==null)
	 {
		productIdMap=new HashMap<Integer,Product>();
	 // Creating some objects of Product while initializing
	 Product p1=new Product(1, "lego","kid toy","5");
	 Product p2=new Product(2, "animal","zoo","10");
	 Product p3=new Product(3, "juice","food","20");
	 Product p4=new Product(4, "shirt","clothing","30");	 
	 productIdMap.put(1,p1);
	 productIdMap.put(2,p2);
	 productIdMap.put(3,p3);
	 productIdMap.put(4,p4);
	 }
	 }
	
	public List<Product> getAllProducts()
	 {
	 List<Product> products = new ArrayList<Product>(productIdMap.values());
	 return products;
	 }
	
	public Product getProduct(int id)
	 {
		Product product= productIdMap.get(id);
	     return product;
	 }
	public Product addProduct(Product product)
	 {
		product.setProductId(getMaxId()+1);
		productIdMap.put(product.getProductId(), product);
	    return product;
	 }
	
	public Product updateProduct(Product product)
	 {
	 if(product.getProductId()<=0)
	 return null;
	 productIdMap.put(product.getProductId(), product);
	 return product;	 
	 }
	
	public void deleteProduct(int id)
	 {
		productIdMap.remove(id);
	 }
	 
	 public static HashMap<Integer, Product> getproductIdMap() {
		 
	 return productIdMap;
	 }
	 
	// Utility method to get max id
	 public static int getMaxId()
	 { int max=0;
	 for (int id:productIdMap.keySet()) { 
	 if(max<=id)
	 max=id;
	 
	 } 
	 return max;
	 }






}
	


