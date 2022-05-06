package com.springapps.springorm.product.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

public class ProductApp {

	
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springorm/product/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		
		//createProduct(productdao);
		//updateProduct(productdao);
		//deleteProduct(productdao);
		//findProduct(productdao, 1);
		findAllProducts(productdao);
		
	}
	private static void findAllProducts(ProductDao productdao) {
		List<Product> products = productdao.findAll();
		System.out.println(products);
	}

	private static void findProduct(ProductDao productdao, int id) {
		Product product = productdao.find(id);
		System.out.println(product);
	}

	private static void deleteProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		productdao.delete(product);
		System.out.println("Product deleted.");
	}

	private static void updateProduct(ProductDao productdao) {
		Product product =new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(18000);
		productdao.update(product);
		System.out.println("product updated");
		
	}

	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(2);
		product.setName("smartphone");
		product.setDescription("big screen");
		product.setPrice(21560);
		int result = productdao.create(product);
		System.out.println("Number of rows inserted: " + result);
	}
}
