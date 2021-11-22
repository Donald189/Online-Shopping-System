package com.edubridge.springboot.project.onlineshopping.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "cart_orders", joinColumns = @JoinColumn(name = "cartId"),
    inverseJoinColumns = @JoinColumn(name = "productId"))
	private List<Products> products;
	
	public Cart() {}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartId, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return cartId == other.cartId && Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", products=" + products + "]";
	}

		
	
}
