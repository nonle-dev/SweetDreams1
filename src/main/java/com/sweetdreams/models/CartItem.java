package com.sweetdreams.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
	private Integer productId;
	private String name;
	private String nameproduct;
	private double price;
	private int qty = 1;

	public CartItem() {
		super();
	}

	public CartItem(Integer productId, String name, String nameproduct, double price, int qty) {
		super();
		this.productId = productId;
		this.name = name;
		this.nameproduct = nameproduct;
		this.price = price;
		this.qty = qty;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     
	public String getNameproduct() {
		return nameproduct;
	}

	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
}
