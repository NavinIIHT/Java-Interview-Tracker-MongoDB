package com.iiht.interviewtracker.service;

import static com.iiht.interviewtracker.utils.InterviewUtilities.convertToInterview;
import static com.iiht.interviewtracker.utils.InterviewUtilities.convertToInterviewDto;
import static com.iiht.interviewtracker.utils.InterviewUtilities.convertToInterviewDtoList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.interviewtracker.dto.InterviewDTO;
import com.iiht.interviewtracker.model.Interview;
import com.iiht.interviewtracker.repository.InterviewRepository;

@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
    private InterviewRepository interviewRepository;

	@Override
	public InterviewDTO saveInterview(InterviewDTO interviewDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InterviewDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterviewDTO updateInterview(InterviewDTO interviewDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterviewDTO delete(InterviewDTO interviewdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterviewDTO findInterviewByName(String interviewName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterviewDTO findByInterviewerName(String interviewerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countInterviews() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InterviewDTO addAttendee(String interviewId, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterviewDTO showInterview(String interviewId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
