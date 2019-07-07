package com.onivaldo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartorio {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int cartorioId;
	@Column
	private String cartorio;
	
	public Cartorio() {}
	
	public Cartorio(int cartorioId, String cartorio) {
		super();
		this.cartorioId = cartorioId;
		this.cartorio = cartorio;
	}

	public int getCartorioId() {
		return cartorioId;
	}

	public void setCartorioId(int cartorioId) {
		this.cartorioId = cartorioId;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
}
