package com.example.internship.dao;

import com.example.internship.entity.Feedback;
import com.example.internship.entity.Lecture;
import com.example.internship.entity.Student;
import com.example.internship.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class FeedbackDAO
{
	 public void addFeedback(Feedback feedback, int studentId, int lectureId)
	 
	 {
	        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
	        
	        try 
	        
	        {
	            em.getTransaction().begin();

	            Student s = em.find(Student.class, studentId);
	            Lecture l = em.find(Lecture.class, lectureId);

	            if (s == null || l == null)
	            
	            {
	                System.out.println("Invalid student or lecture ID!");
	                em.getTransaction().rollback();
	                return;
	            }

	            feedback.setStudent(s);
	            feedback.setLecture(l);
	            em.persist(feedback);

	            em.getTransaction().commit();
	            
	            System.out.println("Feedback submitted successfully.");
	        } 
	        
	        finally 
	        
	        {
	            em.close();
	        }

}	
}
