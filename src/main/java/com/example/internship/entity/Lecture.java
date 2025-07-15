
package com.example.internship.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "lectures")
public class Lecture

{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "topic", nullable = false)
    private String topic;

    @Column(name = "speaker", nullable = false)
    private String speaker;

    @Column(name = "date")
    private LocalDate date;

   
    public int getId() 
    
    {
        return id;
    }

    public void setId(int id) 
    
    {
        this.id = id;
    }

    public String getTopic() 
    
    {
        return topic;
    }

    public void setTopic(String topic)
    
    {
        this.topic = topic;
    }

    public String getSpeaker() 
    
    {
        return speaker;
    }

    public void setSpeaker(String speaker) 
    
    {
        this.speaker = speaker;
    }

    public LocalDate getDate() 
    
    {
        return date;
    }

    public void setDate(LocalDate date)
    
    {
        this.date = date;
    }
}
