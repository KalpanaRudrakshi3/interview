package com.portal.interviewpreparation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="interview77")
@Setter
@Getter

public class InterviewEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
Integer id;
String name;
int marks;
	
	
	

}
