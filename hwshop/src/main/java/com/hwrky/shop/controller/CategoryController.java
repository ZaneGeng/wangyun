package com.hwrky.shop.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwrky.shop.entity.Category;
import com.hwrky.shop.service.CategoryService;

@Controller
@RequestMapping(value="/category")
public class CategoryController {
	
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping(value="/selectlist")
	public String getCategoryList(Map map) {		
		List<Category> list = categoryService.getCategoryList();
		map.put("list", list);
		return "fragment";
	}

}
