package com.onivaldo.service;

import java.util.List;
import com.onivaldo.model.Cartorio;

public interface CartorioService {
	public void add(Cartorio cartorio);
	public void edit(Cartorio cartorio);
	public void delete(int cartorioId);
	public Cartorio getCartorio(int cartorioId);
	public List getAllCartorio();
}
