package com.qa.ims.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Order;

@RunWith(MockitoJUnitRunner.class)

public class OrderServicesTest {

	@Mock
	private Dao<Order> OrderDao;

	@InjectMocks
	private OrderServices orderServices;

	@Test
	public void orderServicesCreate() {
		Order order = new Order(1L, 1L, 1L, 3.142);
		orderServices.create(order);
		Mockito.verify(OrderDao, Mockito.times(1)).create(order);
	}

	@Test
	public void orderServicesRead() {
		orderServices.readAll();
		Mockito.verify(OrderDao, Mockito.times(1)).readAll();
	}

	@Test
	public void orderServicesUpdate() {
		Order order = new Order(1L, 1L, 1L, 45.50);
		orderServices.update(order);
		Mockito.verify(OrderDao, Mockito.times(1)).update(order);
	}

	@Test
	public void orderServicesDelete() {
		orderServices.delete(1L);
		;
		Mockito.verify(OrderDao, Mockito.times(1)).delete(1L);
	}

}
