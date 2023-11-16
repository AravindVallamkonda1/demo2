package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SurveyDetails;

public interface SurveyService {

	SurveyDetails createSurvey(SurveyDetails survey);
	List<SurveyDetails> getAllSurveys();
	SurveyDetails getSurveyById(long id);
	SurveyDetails updateSurvey(SurveyDetails survey,long id);
	String deleteSurvey(long id);
}

