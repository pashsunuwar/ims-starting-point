package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Product;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class ProductController implements CrudController<Product> {

	public static final Logger LOGGER = Logger.getLogger(ProductController.class);

	private CrudServices<Product> productService;

	public ProductController(CrudServices<Product> productService) {
		this.productService = productService;
	}

	String getInput() {
		return Utils.getInput();
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Product> readAll() {
		List<Product> products = productService.readAll();
		for (Product product : products) {
			LOGGER.info(product.toString());
		}
		return products;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Product create() {
		LOGGER.info("Please enter a product title");
		String product_title = getInput();
		LOGGER.info("Please enter the price of the product");
		Double price = Double.parseDouble(getInput());
		LOGGER.info("Please enter quantity of item you wish to purchase");
		Integer quantity = Integer.valueOf(getInput());

		Product product = productService.create(new Product(product_title, price, quantity));
		LOGGER.info("Product created");
		return product;
	}

	@Override
	public Product update() {
		LOGGER.info("Please enter the product id to update its details");
		Long product_id = Long.valueOf(getInput());

		LOGGER.info("Please enter a new product title");
		String product_title = getInput();

		LOGGER.info("Please enter the new price");
		Double price = Double.parseDouble(getInput());

		LOGGER.info("Please enther the new product quantity");
		Integer quantity = Integer.parseInt(getInput());

		Product product = productService.update(new Product(product_id, product_title, price, quantity));
		LOGGER.info("Product successfully updated");
		return product;
	}

	@Override
	public void delete() {
		LOGGER.info("Please enter the product_id of the item you would like to delete");
		Long product_id = Long.valueOf(getInput());
		productService.delete(product_id);
		LOGGER.info("Successfully deleted product details");

	}

}
