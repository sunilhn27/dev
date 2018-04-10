package com.java.springboot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.Custmer.Entity.Coustmer;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Coustmer.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		Coustmer theCoustmer = new Coustmer("sunil", "shetty", "sunil@gmail.com");

		session.save(theCoustmer);

		session.getTransaction().commit();
	}

}
