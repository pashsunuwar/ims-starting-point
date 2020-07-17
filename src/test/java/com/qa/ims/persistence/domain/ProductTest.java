package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	private Product product;
	private Product other;

	@Before
	public void setUp() {
		product = new Product(1L, "Desk lamp", 34., 2);
		other = new Product("pc", 999.9, 5);
	}

	@Test
	public void settersTest() {
		assertNotNull(product.getProduct_id());
		assertNotNull(product.getProduct_title());
		assertNotNull(product.getPrice());

//		product.setProduct_id(null);
//		assertNull(product.getProduct_id());
		product.setProduct_title(null);
		assertNull(product.getProduct_title());
		product.setPrice((Double) null);
		assertNull(product.getPrice());

	}

	@Test
	public void equalsWithNull() {
		assertFalse(product.equals(null));
	}

	@Test
	public void equalsWithDifferentObject() {
		assertFalse(product.equals(new Object()));
	}

	@Test
	public void createProductWithId() {
		assertEquals(1L, product.getProduct_id(), 0);
		assertEquals("Desk lamp", product.getProduct_title());
		assertEquals(34.0, product.getPrice(), 0);
	}

	@Test
	public void checkEquality() {
		assertTrue(product.equals(product));
	}

	@Test
	public void product_titleNullButOtherNameNotNull() {
		product.setProduct_title(null);
		assertFalse(product.equals(other));
	}

	@Test
	public void product_titleNotEqual() {
		other.setProduct_title("pc");
		assertFalse(product.equals(other));
	}

	@Test
	public void toStringTest() {
		String toString = "Product [id = " + 1 + ", product_title = " + "Desk lamp" + ", price = £" + 34.0
				+ ", quantity = " + 2 + "]";
		assertEquals(toString, product.toString());
	}

}
