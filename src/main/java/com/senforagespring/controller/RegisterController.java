package com.senforagespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.senforagespring.dao.IClient;
import com.senforagespring.dao.IVillage;
import com.senforagespring.entities.Client;
import com.senforagespring.entities.Village;

@Controller
public class RegisterController {

	@Autowired
	private IVillage villagedao;
	
	
	@RequestMapping(value = "/Register")
	public String registre() {
		return "examples/register-page";
	}
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/Accueil", method = RequestMethod.GET)
	public String Accueil() {
		return "index";
	}
	
	
	@RequestMapping(value = "/Dashboard", method = RequestMethod.POST)
	public String gestion() {
		return "example/dashboard";
	}
	
	@RequestMapping(value = "/Dashboard", method = RequestMethod.GET)
	public String dashboard() {
		return "example/dashboard";
	}
	

	@RequestMapping(value = "/ClientUser", method = RequestMethod.GET)
	public ModelAndView user() {
		ModelAndView m = new ModelAndView();
		List<Village> villages = villagedao.findAll();
		return new ModelAndView("example/user", "liste_village", villages);
	}
	
	@RequestMapping(value = "/VillageUser", method = RequestMethod.GET)
	public String VillageUser() {
		return "example/VillageUsers";
	}
	
}
