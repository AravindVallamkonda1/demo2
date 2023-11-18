package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ResourceNotFoundException.ResourceNotFoundException;
import com.example.demo.Validations.TechnicalValidations;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.SurveyDetails;
import com.example.demo.repository.SurveyRepository;
import com.example.demo.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	private SurveyRepository surRepo;
	
	@Override
	public ResponseDTO createSurvey(SurveyDetails survey) {
		String res=TechnicalValidations.createSurvey(survey);
		if(res.equals("")) {
		surRepo.save(survey);
		return new ResponseDTO("201","CREATED",res,survey);
		}
		return new ResponseDTO("400","BAD_REQUEST",res,survey);
		
	}

	@Override
	public ResponseDTO getAllSurveys() {
		ArrayList<SurveyDetails> surdet = (ArrayList<SurveyDetails>) surRepo.findAll();
		return new ResponseDTO("200","OK","",surdet);
	}

	@Override
	public ResponseDTO getSurveyById(long id) {
		ResponseDTO resp ;
		Optional<SurveyDetails> survey = surRepo.findById(id);
		if(survey.isPresent()) {
			resp = new ResponseDTO("200","SUCCESS","",survey.get());
			return resp;
		}else {
			resp = new ResponseDTO("404","RESOURCE_NOT_Found","",new ArrayList<SurveyDetails>());
		}
		return resp;
	}

	@Override
	public ResponseDTO updateSurvey(SurveyDetails survey, long id) {
		ResponseDTO resp ;
		Optional<SurveyDetails> currentSurvey1 = surRepo.findById(id);
		if(currentSurvey1.isPresent()) {
			SurveyDetails currentSurvey = currentSurvey1.get();
			String res = TechnicalValidations.createSurvey(survey);
			if(res.equals("")) {
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
				resp = new ResponseDTO("200","SUCCESS","",currentSurvey);
			}else {
				resp = new ResponseDTO("200","BAD_REQUEST",res,currentSurvey);
			}
		}else {
			resp = new ResponseDTO("404","RESOURCE_NOT_Found","",new ArrayList<SurveyDetails>());
		}
		return resp;
	}
		
	
	@Override
	public ResponseDTO deleteSurvey(long id) {
		
		ResponseDTO resp ;
		Optional<SurveyDetails> survey = surRepo.findById(id);
		if(survey.isPresent()) {
			surRepo.deleteById(id);
			resp = new ResponseDTO("200","SUCCESS","",new ArrayList<SurveyDetails>());
			return resp;
		}else {
			resp = new ResponseDTO("404","RESOURCE_NOT_Found","",new ArrayList<SurveyDetails>());
		}
		return resp;

	}
	
	
}
	
