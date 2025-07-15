package com.example.internship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "students")
public class Student 

{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getId() 
    
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }
}
