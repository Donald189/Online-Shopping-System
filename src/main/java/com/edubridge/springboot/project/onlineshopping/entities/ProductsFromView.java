package com.edubridge.springboot.project.onlineshopping.entities;

import java.util.Objects;

public class ProductsFromView {
	
    private String productId;
	
	private String productName;
	
	private double productCost;
	
	private String description;
	
	public ProductsFromView() {}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, productCost, productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsFromView other = (ProductsFromView) obj;
		return Objects.equals(description, other.description)
				&& Double.doubleToLongBits(productCost) == Double.doubleToLongBits(other.productCost)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "ProductsFromView [productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + ", description=" + description + "]";
	}
	
	

}
