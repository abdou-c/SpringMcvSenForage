package com.senforagespring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nomComplet;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private int etat;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_roles",
	joinColumns = {@JoinColumn(name = "idU", nullable = false, updatable = false)},
	inverseJoinColumns = {@JoinColumn(name = "UdR", nullable = false, updatable = false)})
	private List<Roles> roles = new ArrayList<Roles>();
	
	//constructor sans argument
	public User() {
		super();
	}

	//constructor avec argument
	public User(int id, String nomComplet, String email, String password, int etat, List<Roles> roles) {
		super();
		this.id = id;
		this.nomComplet = nomComplet;
		this.email = email;
		this.password = password;
		this.etat = etat;
		this.roles = roles;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
	
}
