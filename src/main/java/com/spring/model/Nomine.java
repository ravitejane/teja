package com.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Nomine")
public class Nomine implements Serializable{
	
	private static final long serialVersionUID = 8259112936028345317L;
	
	@Column(unique=true)
	private String nomine_id;	
	@Id
	@Column(name="customer_code", unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="li"))
	private String code;
	
	private String name;
	private Date date_of_birth;

	private String phone;
	private String email;
	private String relation_with_life_assured;
	
	private String gender;	
	
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Life_Insurance li;



	public String getNomine_id() {
		return nomine_id;
	}



	public void setNomine_id(String nomine_id) {
		this.nomine_id = nomine_id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRelation_with_life_assured() {
		return relation_with_life_assured;
	}



	public void setRelation_with_life_assured(String relation_with_life_assured) {
		this.relation_with_life_assured = relation_with_life_assured;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Life_Insurance getLi() {
		return li;
	}



	public void setLi(Life_Insurance li) {
		this.li = li;
	}

	
}
