package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	private Order test1;
	private Order test2;
	private Order test3;

	@Before
	public void setUp() {
		test1 = new Order(1L, 11L); // customer id, product id,
		test2 = new Order(1L, 2L, 44.44); // customer id, product id, total price
		test3 = new Order(1L, 2L, 7L, 28.5); // order id, customer id, product id, total price
	}

	@Test
	public void toStringTest() {
		String toString = "Order [order_id =" + 1L + ", customer_id =" + 2L + ", product_id =" + 7L
				+ ", total_price = £" + 28.5 + "]";
		assertEquals(toString, test3.toString());
	}

	@Test
	public void settersTest() {

		assertNotNull(test3.getcustomer_id());
		assertNotNull(test3.getOrder_id());
		assertNotNull(test3.getProduct_id());
		assertNotNull(test3.getTotal_price());

		test3.setCustomer_id(null);
		test3.setOrder_id(null);
		test3.setProduct_id(null);
		test3.setTotal_price(0);

	}

//	@Test
//	public void equalsTest() {
//		assertTrue(test1.equals(test2));
//		assertTrue(test1.equals(test2));
//		assertFalse(test1.equals(test3));
//		assertFalse(test1.equals(null));
//	}

}
