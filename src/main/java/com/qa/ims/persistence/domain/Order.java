package com.qa.ims.persistence.domain;

public class Order {

	private Long order_id;
	private Long customer_id;
	private Long product_id;
	private double total_price;

	@Override
	public String toString() {
		return "Order [order_id =" + order_id + ", customer_id =" + customer_id + ", product_id =" + product_id
				+ ", total_price = £" + total_price + "]";
	}

	public Order(Long customer_id, Long product_id, double total_price) {
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.total_price = total_price;
	}

	public Order(Long customer_id, Long product_id) {
		this.customer_id = customer_id;
		this.product_id = product_id;
	}

	public Order(Long order_id, Long customer_id, Long product_id, double total_price) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.total_price = total_price;
	}

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public long getcustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

}
