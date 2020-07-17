package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = Logger.getLogger(OrderController.class);

	private CrudServices<Order> orderService;

	public OrderController(CrudServices<Order> orderService) {
		this.orderService = orderService;
	}

	public String getInput() {
		return Utils.getInput();
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderService.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	@Override
	public Order create() {
		// TODO Auto-generated method stub
		LOGGER.info("Enter Your Customer Id");
		long customer_id = Long.valueOf(getInput());
		LOGGER.info("What is the product ID?");
		Long product_id = Long.valueOf(getInput());
		LOGGER.info("Your new total is: ");
		Long total_price = Long.valueOf(getInput());

		Order order = orderService.create(new Order(customer_id, product_id, total_price));
		LOGGER.info("Order created ");

		return order;
	}

	@Override
	public Order update() {
		// TODO Auto-generated method stub
		LOGGER.info("Please enter the id of the order you would like to update");
		Long order_id = Long.valueOf(getInput());

		LOGGER.info("Please enter your customer ID.");
		Long customer_id = Long.valueOf(getInput());

		LOGGER.info("Please enter the product ID you would like to update.");
		Long product_id = Long.valueOf(getInput());

		LOGGER.info("Please enter the new total.");
		double total_price = Double.valueOf(getInput());

		Order order = orderService.update(new Order(order_id, customer_id, product_id, total_price));
		LOGGER.info("Order updated");
		return order;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long order_id = Long.valueOf(getInput());
		orderService.delete(order_id);

	}

}
