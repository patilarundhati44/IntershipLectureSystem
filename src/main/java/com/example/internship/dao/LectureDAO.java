package com.example.internship.dao;

import java.util.List;

import com.example.internship.entity.Lecture;
import com.example.internship.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class LectureDAO
{
	public void addLecture(Lecture lecture) 
	
    {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(lecture);
        em.getTransaction().commit();
        em.close();
    }

	public Lecture getLectureById(int lid) 
	{
		
		return null;
	}

	public List<Lecture> getAllLectures()
	{
	    EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
	    return em.createQuery("select l from Lecture l", Lecture.class).getResultList();
	}

}
