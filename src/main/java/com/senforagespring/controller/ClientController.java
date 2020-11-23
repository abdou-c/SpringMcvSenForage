package com.senforagespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.senforagespring.dao.IClient;
import com.senforagespring.dao.IVillage;
import com.senforagespring.entities.Client;
import com.senforagespring.entities.Village;

 @Controller 
 public class ClientController {
	 //lister client
	 @Autowired
		private IClient clientdao;
	 @Autowired
		private IVillage villagedao;
		@RequestMapping(value = "/Tables", method = RequestMethod.GET)
			public ModelAndView liste() {
				List<Client> clients = clientdao.findAll();
				return new ModelAndView("example/tables", "liste_client", clients);
			}
		
		//add client
			@RequestMapping(value = "/Client/Add", method = RequestMethod.POST)
				public ModelAndView add(String prenom, String nom, String adresse, String numTelephone, int village) {
					ModelAndView modelAndView = new ModelAndView();
					Client client = new Client();
					client.setPrenom(prenom);
					client.setNom(nom);
					client.setAdresse(adresse);
					client.setNumTelephone(numTelephone);
					client.setVillage(villagedao.findById(village).get());
					
					
//					clientdao.save(client);
					
					try {
						clientdao.save(client);
						modelAndView.addObject("result", new String("Données ajoutées"));
					} catch (Exception e) {
						modelAndView.addObject("result", new String("Données non ajoutées"));
					}

					modelAndView.addObject(new String("example/add"));
					return new ModelAndView("example/add");
				}

 }
 
 
 