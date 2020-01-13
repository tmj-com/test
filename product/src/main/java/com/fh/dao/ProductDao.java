package com.fh.dao;

import java.util.List;

import com.fh.model.PinPai;
import com.fh.model.Product;

public interface ProductDao {

	void addProduct(Product product);

	List<PinPai> pinpaiqueryList();

}
