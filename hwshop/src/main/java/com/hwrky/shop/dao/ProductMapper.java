package com.hwrky.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hwrky.shop.entity.Product;

public interface ProductMapper {

	public int insertOne(@Param("product")Product product);
	
	public int updateOne(@Param("product")Product product);
	
	public Product select();

	public List<Product> selectMoreList();
	
	public Product selectOne();
	
	public List<Product> selectTitle();
	
	public Product selectTotal();
	
	public List<Product> selectMoreListTotal();
	
}
