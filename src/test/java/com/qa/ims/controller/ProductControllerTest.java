package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Product;
import com.qa.ims.services.ProductServices;

@RunWith(MockitoJUnitRunner.class)

public class ProductControllerTest {

	/**
	 * The thing I want to fake functionlity for
	 */
	@Mock
	private ProductServices productServices;

	/**
	 * Spy is used because i want to mock some methods inside the item I'm testing
	 * InjectMocks uses dependency injection to insert the mock into the customer
	 * controller
	 */
	@Spy // for the methods in productController
	@InjectMocks // for any classes our productController calls (in this case productService)

	private ProductController productController;

	@Test
	public void readAllTest() {
		ProductController productController = new ProductController(productServices);
		List<Product> products = new ArrayList<>();
		products.add(new Product("Desk lamp", 45.0, 2));
		products.add(new Product(2L, "pc", 42801.2, 1));
		Mockito.when(productServices.readAll()).thenReturn(products);
		assertEquals(products, productController.readAll());
	}

	@Test
	public void createTest() {
//		ProductController productController = new ProductController(productServices);
		String product_title = "Pillow";
		Double price = 69.69;
		int quantity = 2;
//		Mockito.doReturn(product_title, price.toString(), quantity).when(productController).getInput();
//		Product product = new Product(product_title, price, quantity);
//		Product savedProduct = new Product(2L, "Pillow", 69.69, 2);
//		Mockito.when(productServices.create(product)).thenReturn(savedProduct);
//		assertEquals(savedProduct, productController.create());
	}

	/**
	 *
	 */
	@Test
	public void updateTest() {
//		ProductController productController = new ProductController(productServices)
		Long product_id = 1L;
		String product_title = "Pillow";
		Double price = 69.69;
		int quantity = 2;
//		Mockito.doReturn(product_id.toString(), product_title, price.toString(), quantity).when(productController)
//				.getInput();
//		Product product = new Product(1L, product_title, price, quantity);
//		Mockito.when(productServices.update(product)).thenReturn(product);
//		assertEquals(product, productController.update());
	}

	/**
	 * Delete doesn't return anything, so we can just verify that it calls the
	 * delete method
	 */
	@Test
	public void deleteTest() {
		Long product_id = 1L;
		Mockito.doReturn(product_id.toString()).when(productController).getInput();
		productController.delete();
		Mockito.verify(productServices, Mockito.times(1)).delete(1L);
	}
}