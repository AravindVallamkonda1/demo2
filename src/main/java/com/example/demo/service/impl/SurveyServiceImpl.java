package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ResourceNotFoundException.ResourceNotFoundException;
import com.example.demo.entity.SurveyDetails;
import com.example.demo.repository.SurveyRepository;
import com.example.demo.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	private SurveyRepository surRepo;
	
	@Override
	public SurveyDetails createSurvey(SurveyDetails survey) {
		surRepo.save(survey);
		return survey;
	}

	@Override
	public List<SurveyDetails> getAllSurveys() {
		return surRepo.findAll();
	}

	@Override
	public SurveyDetails getSurveyById(long id) {
		Optional<SurveyDetails> survey = surRepo.findById(id);
		if(survey.isPresent()) {
			return survey.get();
		}else {
			throw new ResourceNotFoundException("Student", "Id", id);
		}
	}

	@Override
	public SurveyDetails updateSurvey(SurveyDetails survey, long id) {
		SurveyDetails currentSurvey = surRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student","ID",id));
		currentSurvey.setFirstName(survey.getFirstName());
		currentSurvey.setLastName(survey.getLastName());
		currentSurvey.setPhoneNumber(survey.getPhoneNumber());
		currentSurvey.setEmail(survey.getEmail());
		currentSurvey.setStreetAddress(survey.getStreetAddress());
		currentSurvey.setCity(survey.getCity());
		currentSurvey.setState(survey.getState());
		currentSurvey.setZip(survey.getZip());
		currentSurvey.setDateOfSurvey(survey.getDateOfSurvey());
		currentSurvey.setLikeOnCampus(survey.getLikeOnCampus());
		currentSurvey.setLikeness(survey.getLikeness());
		currentSurvey.setLuckyDraw(survey.getLuckyDraw());
		currentSurvey.setComments(survey.getComments());
		surRepo.save(currentSurvey);
		return currentSurvey;
	}

	@Override
	public String deleteSurvey(long id) {
		Optional<SurveyDetails> survey = surRepo.findById(id);
		if(survey.isPresent()) {
			surRepo.deleteById(id);
			return "Deleted survey with Id : "+id;
		}else {
			return "Unable to find survey with Id : "+id;
		}
	}
	
	
}
	
