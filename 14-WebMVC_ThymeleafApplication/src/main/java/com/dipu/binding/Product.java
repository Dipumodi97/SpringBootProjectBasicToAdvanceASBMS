package com.dipu.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {

	@NotNull(message = "ID is Required")
	private Integer productId;
	@NotNull(message = "Name is Required")
	@Size(min=3, max = 8)
	private String productName;
	@NotNull(message = "Price is Required")
	private Double price;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
}
