package com.fh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.dao.ProductDao;
import com.fh.model.PinPai;
import com.fh.model.Product;
import com.fh.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.addProduct(product);
	}

	public List<PinPai> pinpaiqueryList() {
		// TODO Auto-generated method stub
		return productDao.pinpaiqueryList();
	}
}
