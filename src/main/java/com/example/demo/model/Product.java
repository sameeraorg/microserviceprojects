package com.example.demo.model;

import java.util.List;

public class Product {
	
	private int ProductId;
	private String ProductName;
	private String ProductDesc;
	private String ProductPrice;
	
	public Product()
	{
		super();
	}
	
	
	public Product(int id,String productName,String productDesc,String productPrice) {
		super();
		this.ProductId=id;
		this.ProductName=productName;
		this.ProductDesc=productDesc;
		this.ProductPrice=productPrice;		
	}
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		this.ProductId= productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) {
		this.ProductDesc = productDesc;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		this.ProductPrice = productPrice;
	}


	public static List getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
