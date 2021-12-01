package com.lti.semos;

public class Product {
	private int prdId;
	private String prdName;
	
	
	
	
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + "]";
	}
	
	
	public Product()
	{
		super();
	}


	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}


	private int getPrdId() {
		return prdId;
	}


	private void setPrdId(int prdId) {
		this.prdId = prdId;
	}


	private String getPrdName() {
		return prdName;
	}


	private void setPrdName(String prdName) 
	{
		this.prdName = prdName;
	}
	
	
	
	}
	
	
	


