package com.example.demo.entity;

import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentsurvey")
public class SurveyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="phone_number")
	private long phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="street_address")
	private String streetAddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private int zip;
	
	@Column(name="date_of_survey")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfSurvey;
	
	@Column(name="line_on_campus")
	private String likeOnCampus;
	
	@Column(name="interest_factor")
	private String interestFactor;
	
	@Column(name="likeness")
	private String likeness;
	
	@Column(name="lucky_draw")
	private String luckyDraw;
	
	@Column(name="comments")
	private String comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Date getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(Date dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getLikeOnCampus() {
		return likeOnCampus;
	}

	public void setLikeOnCampus(String likeOnCampus) {
		this.likeOnCampus = likeOnCampus;
	}

	public String getInterestFactor() {
		return interestFactor;
	}

	public void setInterestFactor(String interestFactor) {
		this.interestFactor = interestFactor;
	}

	public String getLikeness() {
		return likeness;
	}

	public void setLikeness(String likeness) {
		this.likeness = likeness;
	}

	public String getLuckyDraw() {
		return luckyDraw;
	}

	public void setLuckyDraw(String luckyDraw) {
		this.luckyDraw = luckyDraw;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, comments, dateOfSurvey, email, firstName, id, interestFactor, lastName, likeOnCampus,
				likeness, luckyDraw, phoneNumber, state, streetAddress, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyDetails other = (SurveyDetails) obj;
		return Objects.equals(city, other.city) && Objects.equals(comments, other.comments)
				&& Objects.equals(dateOfSurvey, other.dateOfSurvey) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(interestFactor, other.interestFactor) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(likeOnCampus, other.likeOnCampus) && Objects.equals(likeness, other.likeness)
				&& Objects.equals(luckyDraw, other.luckyDraw) && phoneNumber == other.phoneNumber
				&& Objects.equals(state, other.state) && Objects.equals(streetAddress, other.streetAddress)
				&& zip == other.zip;
	}

	@Override
	public String toString() {
		return "SurveyDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", dateOfSurvey=" + dateOfSurvey + ", likeOnCampus=" + likeOnCampus
				+ ", interestFactor=" + interestFactor + ", likeness=" + likeness + ", luckyDraw=" + luckyDraw
				+ ", comments=" + comments + "]";
	}



	
	
}
