package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SurveyDetails;
 	
public interface SurveyRepository extends JpaRepository<SurveyDetails,Long>{

}
