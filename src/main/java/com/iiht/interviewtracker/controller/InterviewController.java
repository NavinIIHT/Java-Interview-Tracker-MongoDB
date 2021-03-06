package com.iiht.interviewtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.interviewtracker.dto.InterviewDTO;
import com.iiht.interviewtracker.service.InterviewService;

@RestController
@RequestMapping("/interview")
public class InterviewController {

	@Autowired
    private InterviewService interviewService;
	
	@PostMapping(value = "/addInterview")
	public ResponseEntity<InterviewDTO> addInterview(@RequestBody InterviewDTO interviewdto) {
		return null;
	}
	
	@PostMapping(value = "/addAttendee/{interviewId}/{userId}")
	public ResponseEntity<InterviewDTO> addAttendee(@PathVariable("interviewId") String interviewId,@PathVariable("userId") String userId)
	{
		return null;
	}
	
	@PutMapping(value = "/updateInterview")
	public  ResponseEntity<InterviewDTO> updateInterviews(@RequestBody InterviewDTO interviewdto){
		return null;
	}

	
	@DeleteMapping(value = "/deleteInterview/{interviewId}")
	public  ResponseEntity<InterviewDTO> deleteInterview(@RequestBody InterviewDTO interviewdto){
		return null;
	}
	
	@GetMapping(value = "/showInterview/{interviewId}")
	public ResponseEntity<InterviewDTO> showInterview()
	{
		return null;
	}
	
	@GetMapping(value = "/viewAllInterviews")
	public ResponseEntity<List<InterviewDTO>> viewAllInterviews() {
		 return null;
		
	}
	
	@GetMapping("/search/interviewName/{interviewName}")
	public ResponseEntity<InterviewDTO> findByInterviewName(@PathVariable("interviewName") String  interviewName){
		return null;
	}
	
	@GetMapping("/search/interviewerName/{interviewerName}")
	public ResponseEntity<List<InterviewDTO>> findByInterviewerName(@PathVariable("interviewerName") String  interviewerName){
		return null;
	}
	
	@GetMapping("/count")
	public ResponseEntity<Integer> countNoOfInterviews(){
		return null;
	}
	
}
