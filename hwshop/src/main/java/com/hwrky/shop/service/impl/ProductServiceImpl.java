package com.hwrky.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwrky.shop.dao.ProductMapper;
import com.hwrky.shop.entity.Product;
import com.hwrky.shop.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public boolean add(Product product) {
		if(productMapper.insertOne(product) == 1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean modeify(Product product) {
		if(productMapper.updateOne(product) == 1) {
			return true;
		}else {
			return false;
		}
	}

}
