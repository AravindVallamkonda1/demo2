package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.SurveyDetails;
import com.example.demo.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurController {

	@Autowired
	private SurveyService surser;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("create")
		public ResponseEntity<ResponseDTO> createSurvey(@RequestBody SurveyDetails sur) {	
		return new ResponseEntity<ResponseDTO>(surser.createSurvey(sur),HttpStatus.OK);
	}
	
	@GetMapping("getall")
	public ResponseEntity<ResponseDTO> getAllSurveys(){
		return new ResponseEntity<ResponseDTO>(surser.getAllSurveys(),HttpStatus.OK);
	}
	
	@GetMapping("get/{id}")
	public 	ResponseEntity<ResponseDTO> getSurveyById(@PathVariable("id") long id){
		return new ResponseEntity<ResponseDTO>(surser.getSurveyById(id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("delete/{id}")
	public 	ResponseEntity<ResponseDTO> deleteSurveyById(@PathVariable("id") long id){
		return new ResponseEntity<ResponseDTO>(surser.deleteSurvey(id),HttpStatus.OK);
		
	}
	
	@PutMapping("update/{id}") 
	public 	ResponseEntity<ResponseDTO> updateSurveyById(@PathVariable("id") long id,@RequestBody SurveyDetails sur){
			return new ResponseEntity<ResponseDTO>(surser.updateSurvey(sur,id),HttpStatus.OK);
		
	}
	
	
	
}
