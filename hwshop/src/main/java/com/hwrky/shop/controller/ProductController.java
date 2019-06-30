package com.hwrky.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hwrky.shop.entity.Category;
import com.hwrky.shop.entity.Product;
import com.hwrky.shop.service.ProductService;

@Controller
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="/add")
	public String addProduct() {
		return "productmanage";
	}
	
	@RequestMapping(value="/doadd")
	public String doAddProduct(Product product) {		
		if(productService.add(product)) {
			System.out.println("成功");
			return "insertsuccess";
		}else {
			System.out.println("失败");
		}
		return "insertfail";
	}
}
