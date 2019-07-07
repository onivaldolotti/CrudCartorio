package com.onivaldo.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.onivaldo.dao.CartorioDao;
import com.onivaldo.model.Cartorio;

@Repository
public class CartorioDaoImpl implements CartorioDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Cartorio cartorio) {
		session.getCurrentSession().save(cartorio);
	}

	@Override
	public void edit(Cartorio cartorio) {
		session.getCurrentSession().update(cartorio);
	}

	@Override
	public void delete(int cartorioId) {		
		session.getCurrentSession().delete(getCartorio(cartorioId));
	}

	@Override
	public Cartorio getCartorio(int cartorioId) {
		return (Cartorio)session.getCurrentSession().get(Cartorio.class, cartorioId);
	}

	@Override
	public List getAllCartorio() {
		return session.getCurrentSession().createQuery("from Cartorio").list();
	}

}
