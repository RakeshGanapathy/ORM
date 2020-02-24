package com.hibernate.demo.app;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.UserStorage.Address;
import com.hibernate.demo.UserStorage.UserDetails;

public class HibernateConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetails ud = new UserDetails();
		ud.setName("rocky");
		ud.setDate(new Date());
		ud.setDescription("Database configuration includes jdbc connection url, DB user credentials, driver class and hibernate dialect.");
		Address addr = new Address();
		addr.setDoorNo(21);
		addr.setStreetName("kandigai");
		addr.setStateName("TamilNadu");
		Address addr2 = new Address();
		addr2.setDoorNo(22);
		addr2.setStreetName("kandigai");
		addr2.setStateName("TamilNadu");
		ud.getSetOfAddress().add(addr);
		ud.getSetOfAddress().add(addr2);
		
		//create session factory 
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		//open session 
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ud);
		session.getTransaction().commit();
		session.close();
		/*
		 * UserDetails ud2 = new UserDetails(); Session session2 =
		 * sessionFactory.openSession(); session2.beginTransaction(); ud2 =
		 * session2.get(UserDetails.class, 1); System.out.println(ud2.toString());
		 */
		
	}

}
