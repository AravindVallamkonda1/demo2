package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.SurveyDetails;

public interface SurveyService {

	ResponseDTO createSurvey(SurveyDetails survey);
	ResponseDTO getAllSurveys();
	ResponseDTO getSurveyById(long id);
	ResponseDTO updateSurvey(SurveyDetails survey,long id);
	ResponseDTO deleteSurvey(long id);
}

