package com.hwrky.shop.entity;

import java.util.Date;

public class Product {

	private Integer product_id;
	private String product_name;
	private String product_title;
	private Double product_price;
	private Double product_sale_price;
    private Date product_create_date;
    private Category product_category;
    private Byte product_isEnabled;
    
	public Product() {
		super();
	}
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public Double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}
	public Double getProduct_sale_price() {
		return product_sale_price;
	}
	public void setProduct_sale_price(Double product_sale_price) {
		this.product_sale_price = product_sale_price;
	}
	public Date getProduct_create_date() {
		return product_create_date;
	}
	public void setProduct_create_date(Date product_create_date) {
		this.product_create_date = product_create_date;
	}
	public Category getProduct_category() {
		return product_category;
	}
	public void setProduct_category(Category product_category) {
		this.product_category = product_category;
	}
	public Byte getProduct_isEnabled() {
		return product_isEnabled;
	}
	public void setProduct_isEnabled(Byte product_isEnabled) {
		this.product_isEnabled = product_isEnabled;
	}
    
    

}
