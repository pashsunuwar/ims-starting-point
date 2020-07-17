package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.services.CustomerServices;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

	/**
	 * The thing I want to fake functionlity for
	 */
	@Mock
	private CustomerServices customerServices;

	/**
	 * Spy is used because i want to mock some methods inside the item I'm testing
	 * InjectMocks uses dependency injection to insert the mock into the customer
	 * controller
	 */
	@Spy // for the methods in customerController
	@InjectMocks // for any classes our customerController calls (in this case customerService)
	private CustomerController customerController;

	@Test
	public void readAllTest() {
		CustomerController customerController = new CustomerController(customerServices);
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1L, "Chris", "P"));
		customers.add(new Customer(2L, "Rhys", "T", "Rhys12", "password", "tbone@gmail.com"));
		customers.add(new Customer("Nic", "J", "nicc", "hello222", "tj@gmail.com"));
		Mockito.when(customerServices.readAll()).thenReturn(customers);
		assertEquals(customers, customerController.readAll());
	}

	@Test
	public void createTest() {
		String forename = "Chris";
		String surname = "Perrins";
		String username = "ChrisPerrins";
		String password = "123Chrissdg2352ewt";
		String email = "chrisp@gmai.com";
		Mockito.doReturn(forename, surname, username, password, email).when(customerController).getInput();
		Customer customer = new Customer(forename, surname, username, password, email);
		Customer savedCustomer = new Customer("Chris", "Perrins", "ChrisPerrins", "123Chrissdg2352ewt",
				"chrisp@gmai.com");
		Mockito.when(customerServices.create(customer)).thenReturn(savedCustomer);
		assertEquals(savedCustomer, customerController.create());
	}

	/**
	 *
	 */
	@Test
	public void updateTest() {
		String id = "1";
		String firstName = "Rhys";
		String surname = "Thompson";
		Mockito.doReturn(id, firstName, surname).when(customerController).getInput();
		Customer customer = new Customer(1L, firstName, surname);
		Mockito.when(customerServices.update(customer)).thenReturn(customer);
		assertEquals(customer, customerController.update());
	}

	/**
	 * Delete doesn't return anything, so we can just verify that it calls the
	 * delete method
	 */
	@Test
	public void deleteTest() {
		String id = "1";
		Mockito.doReturn(id).when(customerController).getInput();
		customerController.delete();
		Mockito.verify(customerServices, Mockito.times(1)).delete(1L);
	}

}