package com.example.internship.entity;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

}
