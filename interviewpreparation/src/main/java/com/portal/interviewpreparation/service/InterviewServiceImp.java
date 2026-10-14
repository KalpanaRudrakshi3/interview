package com.portal.interviewpreparation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.interviewpreparation.model.InterviewEntity;
import com.portal.interviewpreparation.repository.InterviewRepo;

@Service
public class InterviewServiceImp implements  InterviewPre {
	
	@Autowired
	InterviewRepo  interviewRepo;
	
	
	@Override
	public InterviewEntity saveInterviewEntity(InterviewEntity i) {
		
		return interviewRepo.save(i);
	}

	@Override
	public InterviewEntity getInterviewEntity(Integer id) {
	
		return interviewRepo.findById(id).orElseThrow();
	}

	@Override
	public List<InterviewEntity> getAllInterviewEntity() {
	
		return interviewRepo.findAll() ;
	}

	@Override
	public InterviewEntity updateInterviewEntity(InterviewEntity i) {
	
		return  interviewRepo.save(i) ;
	}

	@Override
	public void deleteInterviewEntity(Integer id) {
		 interviewRepo.deleteById(id);
		
	}

	
	}


