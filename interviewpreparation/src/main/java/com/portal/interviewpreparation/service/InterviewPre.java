package com.portal.interviewpreparation.service;

import java.util.List;

import com.portal.interviewpreparation.model.InterviewEntity;


public interface InterviewPre {

	InterviewEntity saveInterviewEntity(InterviewEntity i);
	
	InterviewEntity getInterviewEntity(Integer id);
	
	List<InterviewEntity> getAllInterviewEntity();
	
	InterviewEntity updateInterviewEntity(InterviewEntity id);
	
	void   deleteInterviewEntity(Integer id);
	
	
	
}
