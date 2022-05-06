package com.springapps.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

@Component

public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernatetemplate;
	@Override
	@Transactional
	public int create(Product product) {
		Integer result  = (Integer) hibernatetemplate.save(product);
		return result;
	}
	@Override
	@Transactional
	public void update(Product product) {
		hibernatetemplate.update(product);	
		
	}
	@Override
	public void delete(Product product) {
		hibernatetemplate.delete(product);		
	}
	@Override
	public Product find(int id) {
		Product product = hibernatetemplate.get(Product.class, id);
		return product;
	}
	@Override
	public List<Product> findAll() {
		List<Product> products = hibernatetemplate.loadAll(Product.class);
		return products;
	}
	
}
