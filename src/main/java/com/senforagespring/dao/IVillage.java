package com.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senforagespring.entities.Village;

@Repository
public interface IVillage extends JpaRepository<Village, Integer>{
	@Query("SELECT v FROM Village v where v.id=:id")
	public Village getVillageById(@Param("id") int id);
}
