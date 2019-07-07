package com.onivaldo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.onivaldo.dao.CartorioDao;
import com.onivaldo.model.Cartorio;
import com.onivaldo.service.CartorioService;
@Service
public class CartorioServiceImpl implements CartorioService {
	@Autowired
	private CartorioDao cartorioDao;
	
	@Transactional
	public void add(Cartorio cartorio) {
		cartorioDao.add(cartorio);
	}
	
	@Transactional
	public void edit(Cartorio cartorio) {
		cartorioDao.edit(cartorio);
	}
	
	@Transactional
	public void delete(int cartorioId) {
		cartorioDao.delete(cartorioId);
	}
	
	@Transactional
	public Cartorio getCartorio(int cartorioId) {
		return cartorioDao.getCartorio(cartorioId);
	}
	
	@Transactional
	public List getAllCartorio() {
		return cartorioDao.getAllCartorio();
	}
}
