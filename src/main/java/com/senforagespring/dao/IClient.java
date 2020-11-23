package com.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.senforagespring.entities.Client;

@Repository
public interface IClient extends JpaRepository<Client, Integer>{
	@Query("SELECT c FROM Client c where c.nom=:nom")
	public Client getClientByNom(@Param("nom") String nom);
}
