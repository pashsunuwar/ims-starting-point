package com.qa.ims.services;

import java.util.List;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Product;

public class ProductServices implements CrudServices<Product> {

	private Dao<Product> productDao;

	public ProductServices(Dao<Product> customerDao) {
		this.productDao = customerDao;
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}

	@Override
	public Product create(Product product) {
		return productDao.create(product);
	}

	@Override
	public Product update(Product product) {
		return productDao.update(product);
	}

	@Override
	public void delete(Long product_id) {
		productDao.delete(product_id);
	}

}
