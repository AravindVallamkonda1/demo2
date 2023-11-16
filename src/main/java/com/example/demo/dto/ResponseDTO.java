package com.example.demo.dto;

import java.util.ArrayList;

import com.example.demo.entity.SurveyDetails;

public class ResponseDTO {

	private String StatusCode;
	private String StatusDesc;
	private ArrayList<SurveyDetails> SerDet;
	private String ErrorCodes;
	public String getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	public String getStatusDesc() {
		return StatusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		StatusDesc = statusDesc;
	}
	public ArrayList<SurveyDetails> getSerDet() {
		return SerDet;
	}
	public void setSerDet(ArrayList<SurveyDetails> serDet) {
		SerDet = serDet;
	}
	
	public String getErrorCodes() {
		return ErrorCodes;
	}
	public void setErrorCodes(String errorCodes) {
		ErrorCodes = errorCodes;
	}
	public ResponseDTO(String statusCode, String statusDesc, String err,ArrayList<SurveyDetails> serDet) {
		StatusCode = statusCode;
		StatusDesc = statusDesc;
		ErrorCodes = err;
		SerDet = serDet;
	}
	public ResponseDTO(String statusCode, String statusDesc, String err,SurveyDetails serDet) {
		StatusCode = statusCode;
		StatusDesc = statusDesc;
		ErrorCodes = err;
		SerDet = new ArrayList<SurveyDetails>();
		SerDet.add(serDet);
	}
	
	
	
	
}
