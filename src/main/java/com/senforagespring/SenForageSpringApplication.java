package com.senforagespring;
import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.senforagespring.dao.IRoles;
import com.senforagespring.dao.IUser;
import com.senforagespring.entities.Roles;
import com.senforagespring.entities.User;



@SpringBootApplication
public class SenForageSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SenForageSpringApplication.class, args);
		
//		IUser iUser = ctx.getBean(IUser.class);
//		Roles roles = new Roles();
//		roles.setNom("ROLE_USER");
//		
//		User user = new User();
//		user.setNomComplet("ADN");
//		user.setEmail("ADN@gmail.com");
//		user.setPassword("ADN");
//		user.setEtat(1);
//		List<Roles> roless = new ArrayList<Roles>();
//		roless.add(roles);
//		user.setRoles(roless);
//		
//		IUser iUser = ctx.getBean(IUser.class);
//		try {
//			iUser.save(user);
//			System.out.println("ok");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
	
	}
}
