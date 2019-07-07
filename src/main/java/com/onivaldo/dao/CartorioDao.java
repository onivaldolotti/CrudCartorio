package com.onivaldo.dao;

import java.util.List;
import com.onivaldo.model.Cartorio;

public interface CartorioDao {
	public void add(Cartorio cartorio);
	public void edit(Cartorio catorio);
	public void delete(int catorioId);
	public Cartorio getCartorio(int cartorioId);
	public List getAllCartorio();
}
