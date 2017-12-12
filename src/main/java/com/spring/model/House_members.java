package com.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="House_members")
public class House_members
{
	@Id
	private String member_id;
	
	private Date date_of_birth;	
	private String occupation;
	private String sum_sured;
	private Gender gender;
	
	
	private enum Gender{MALE,FEMALE}
	
	@ManyToOne
	private House_Insurance house_Insurance;

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSum_sured() {
		return sum_sured;
	}

	public void setSum_sured(String sum_sured) {
		this.sum_sured = sum_sured;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public House_Insurance getHi() {
		return house_Insurance;
	}

	public void setHi(House_Insurance hi) {
		this.house_Insurance = hi;
	}
	
}
