package com.qa.ims.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ActionTest {

	@Test
	public void actionTest() {
		assertTrue(Action.CREATE.toString().toLowerCase().contains("create"));
		assertTrue(Action.READ.toString().toLowerCase().contains("read"));
		assertTrue(Action.UPDATE.toString().toLowerCase().contains("update"));
		assertTrue(Action.DELETE.toString().toLowerCase().contains("delete"));
		assertTrue(Action.RETURN.toString().contains("RETURN"));
	}

	@Test
	public void DescriptionTest() {
		assertTrue(Action.CREATE.getDescription().toLowerCase()
				.contentEquals("create: to save a new item into the database"));
	}

	@Test
	public void getActionTest() {

	}
}
