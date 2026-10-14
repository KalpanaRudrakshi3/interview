package com.portal.interviewpreparation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.interviewpreparation.model.InterviewEntity;
import com.portal.interviewpreparation.service.InterviewPre;


@CrossOrigin(origins = "http://localhost:3000")

//http:localhost:2233/interview
@RestController
@RequestMapping("/interview")   //endpoint
public class InterviewController {
@Autowired

InterviewPre interviewPre;

//http://localhost:2233/interview/hello
// good ni show chestadii
@GetMapping("/hello")
String hello() {
	return "good "; 
}

//https://localhost:2233/interview/ getInterviewEntity/1 
// only one row of data chudagalm(mana edi postman lo iyena or edge  lo iyena chudavachu)
@GetMapping("getInterviewEntity/{id}")	
InterviewEntity getInterviewEntity(@PathVariable Integer id) {
return  interviewPre. getInterviewEntity(id);
	
}
	
//http://localhost:2233/interview/updateInterview/1
//table uuna value tho inkoka data ni update chestam
	@PutMapping("updateInterview/{id}")
	InterviewEntity updateInterviewEntity(@PathVariable Integer id, @RequestBody InterviewEntity i) {
		
		InterviewEntity interviewEntityFromDB = getInterviewEntity(id);
		
		interviewEntityFromDB.setName(i.getName());
		interviewEntityFromDB.setMarks(i.getMarks());
		;
		
		return interviewPre.updateInterviewEntity(interviewEntityFromDB);
	}
	
	//http://localhost:2233/interview/delete/1
	//database lo uuna oka row delete avuthundi
		@DeleteMapping("delete/{id}")
		String deleteInterviewEntity(@PathVariable Integer id ) {
			interviewPre.deleteInterviewEntity(id);
			return "deleted interviewEntity with"+id+"successfully";
			
		}


		//http://localhost:2233/interview/getAll  
		//table lo uuna data motham show chestadii
		@GetMapping("/getAll")
		List<InterviewEntity>getAllInterviewEntity(){
			 return interviewPre.getAllInterviewEntity();
		}
		
		//http://localhost:2233/interview/create        //table add chestam
		@PostMapping("/create")
		InterviewEntity createInterviewEntityData(@RequestBody InterviewEntity i) {
			
			return interviewPre.saveInterviewEntity(i);
			
		}
		




}
