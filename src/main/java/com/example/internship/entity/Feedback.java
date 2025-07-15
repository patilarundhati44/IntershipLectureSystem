package com.example.internship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")

public class Feedback 

{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    private String comments;
    private int rating;

    
    public void setStudent(Student student)
    
    {
        this.student = student;
    }

    public void setLecture(Lecture lecture) 
    
    {
        this.lecture = lecture;
    }

   
    public Student getStudent() 
    
    {
        return student;
    }

    public Lecture getLecture() 
    
    {
        return lecture;
    }

    public int getId() 
    
    {
        return id;
    }

    public void setId(int id)
    
    {
        this.id = id;
    }

    public String getComments()
    
    {
        return comments;
    }

    public void setComments(String comments)
    
    {
        this.comments = comments;
    }

    public int getRating() 
    
    {
        return rating;
    }

    public void setRating(int rating) 
    
    {
        this.rating = rating;
    }

}
