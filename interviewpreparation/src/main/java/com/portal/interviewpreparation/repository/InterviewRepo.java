package com.portal.interviewpreparation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.interviewpreparation.model.InterviewEntity;

@Repository
public interface InterviewRepo extends JpaRepository<InterviewEntity,Integer> {

}
