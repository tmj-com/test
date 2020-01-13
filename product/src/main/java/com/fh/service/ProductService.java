package com.fh.service;

import java.util.List;

import com.fh.model.PinPai;
import com.fh.model.Product;

public interface ProductService {

	void addProduct(Product product);

	List<PinPai> pinpaiqueryList();

}
