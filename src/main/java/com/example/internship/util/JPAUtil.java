package com.example.internship.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil 
{
	
	 private static final EntityManagerFactory emf = 
		        Persistence.createEntityManagerFactory("InternshipPU");

		    public static EntityManagerFactory getEntityManagerFactory() {
		        return emf;
		    }

}
