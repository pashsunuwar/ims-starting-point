package com.qa.ims.persistence.domain;

public class Product {

	private Long product_id;
	private String product_title;
	private double price;
	private int quantity;

	public Product(String product_title, Double price, int quantity) {
		this.product_title = product_title;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(Long product_id, String product_title, double price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_title = product_title;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id = " + product_id + ", product_title = " + product_title + ", price = £" + price
				+ ", quantity = " + quantity + "]";
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_title() {
		return product_title;
	}

	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
