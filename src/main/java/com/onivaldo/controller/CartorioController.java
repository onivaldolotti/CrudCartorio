package com.onivaldo.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.onivaldo.model.Cartorio;
import com.onivaldo.service.CartorioService;


@Controller
public class CartorioController {
	@Autowired
	private CartorioService cartorioService;
	
	@RequestMapping("/")
	public String setupForm(Map<String, Object> map){
		Cartorio cartorio = new Cartorio();
		map.put("cartorio", cartorio);
		map.put("cartorioList", cartorioService.getAllCartorio());
		return "cartorio";
	}
	@RequestMapping(value="/cartorio.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Cartorio cartorio, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Cartorio cartorioResult = new Cartorio();
		switch(action.toLowerCase()){	
		case "adiciona":
			cartorioService.add(cartorio);
			cartorioResult = cartorio;
			break;
		case "edita":
			cartorioService.edit(cartorio);
			cartorioResult = cartorio;
			break;
		case "deleta":
			cartorioService.delete(cartorio.getCartorioId());
			cartorioResult = new Cartorio();
			break;
		case "procuraid":
			Cartorio procuraCartorio = cartorioService.getCartorio(cartorio.getCartorioId());
			cartorioResult = procuraCartorio!=null ? procuraCartorio : new Cartorio();
			break;
		}
		map.put("cartorio", cartorioResult);
		map.put("cartorioList", cartorioService.getAllCartorio());
		return "cartorio";
	}
}
