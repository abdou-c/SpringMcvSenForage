package com.senforagespring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String libelle;
	
	@Column
	private String localisation;
	
	@OneToMany(mappedBy = "village")
	 private List<Client> client = new ArrayList<Client>();

	//constructor sans argument
	public Village() {
		super();
	}

	//constructor avec argument
	public Village(int id, String libelle, String localisation, List<Client> client) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.localisation = localisation;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}
	
	
	
	
	
	
	
}
