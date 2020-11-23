package com.senforagespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.senforagespring.dao.IVillage;
import com.senforagespring.entities.Client;
import com.senforagespring.entities.Village;

@Controller
public class VillageController {
	@Autowired
	private IVillage villagedao;
	@RequestMapping(value = "/TablesVillages", method = RequestMethod.GET)
		public ModelAndView listeVillage() {
			List<Village> villages = villagedao.findAll();
			return new ModelAndView("example/tablesVill", "liste_village", villages);
		}
	
	@RequestMapping(value = "/Village/Add", method = RequestMethod.POST)
	public ModelAndView add(String libelle, String localisation) {
		ModelAndView modelAndView = new ModelAndView();
		Village village = new Village();
		village.setLibelle(libelle);
		village.setLocalisation(localisation);
		
//		clientdao.save(client);
		
		try {
			villagedao.save(village);
			modelAndView.addObject("result", new String("Données ajoutées"));
		} catch (Exception e) {
			modelAndView.addObject("result", new String("Données non ajoutées"));
		}
		modelAndView.addObject(new String("example/add"));
		return new ModelAndView("example/add");
	}
}
