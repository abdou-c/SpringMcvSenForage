package com.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senforagespring.entities.Roles;

@Repository
public interface IRoles extends JpaRepository<Roles, Integer> {

}
