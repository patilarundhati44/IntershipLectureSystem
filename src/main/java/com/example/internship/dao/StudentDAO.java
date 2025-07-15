package com.example.internship.dao;

import java.util.List;

import com.example.internship.entity.Student;
import com.example.internship.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentDAO 
{
	public void addStudent(Student student)
	
	{
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        
        try
        
        {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            
            System.out.println("Student registered successfully.");
        } 
        
        finally 
        
        {
            em.close();
        }
    }

    public Student findStudentById(int id) 
    {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try 
        
        {
            return em.find(Student.class, id);
        }
        
        finally 
        
        {
            em.close();
        }
    }

	public List<Student> getAllStudents() 
	
	{
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
	    return em.createQuery("select s from Student s", Student.class).getResultList();
	}
	
	public void deleteStudent(int studentId)
	
	{
	    EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try
	    
	    {
	        tx.begin();
	        Student student = em.find(Student.class, studentId);
	        if (student != null) 
	        
	        {
	            em.remove(student);
	            System.out.println("Student deleted successfully.");
	        }
	        
	        else
	        
	        {
	            System.out.println("Student not found.");
	        }
	        
	        tx.commit();
	    }
	    
	    catch (Exception e) 
	    
	    {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } 
	    
	    finally 
	    
	    {
	        em.close();
	    }
	}

	

}
