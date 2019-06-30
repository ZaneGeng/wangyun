package com.hwrky.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hwrky.shop.dao.CategoryMapper;
import com.hwrky.shop.entity.Category;
import com.hwrky.shop.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Resource
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> getCategoryList() {
		return categoryMapper.select();
	}

}
