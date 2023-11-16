package com.example.demo.Validations;

import java.util.HashSet;

import com.example.demo.entity.SurveyDetails;

public class TechnicalValidations {
	
	public static String LikesOnCampus = "students,location,campus,atmosphere,dorm rooms,sports";
	public static String Interest = "friends,television,internet,other";
	public static String Refer = "Very Likely,Likely,Unlikely";
	
	
	public static String createSurvey(SurveyDetails sur){
		StringBuilder resp = new StringBuilder();
		if(!sur.getLikeOnCampus().equals("")) {
			String[] resps = sur.getLikeOnCampus().split(",");
			for (int i = 0;i<resps.length;i++) {
				if(!LikesOnCampus.contains(resps[i].trim())) {
					resp.append("2,");
					break;
				}
			}
		}else {
			resp.append("1,");
		}
		if(!sur.getInterestFactor().equals("")) {
			String[] interests = Interest.split(",");
			HashSet<String> ints = new HashSet<String>();
			for (int i =0;i<interests.length;i++) {
				ints.add(interests[i]);
			}
			if(!ints.contains(sur.getInterestFactor())) {
				resp.append("4,");
			}
		}else {
			resp.append("3,");
		}
		
		if(!sur.getLikeness().equals("")) {
			String[] like = Refer.split(",");
			HashSet<String> likes = new HashSet<String>();
			for (int i =0;i<like.length;i++) {
				likes.add(like[i]);
			}
			if(!likes.contains(sur.getLikeness())) {
				resp.append("6,");
			}
		}else {
			resp.append("5,");
		}
		
		return resp.toString();
	}

}
