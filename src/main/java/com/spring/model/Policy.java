package com.spring.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="policy")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String policy_no;
	private String type;
	private Date next_premium_date;
	private Date purchase_date;
	private String frequency;
	private String premiun_amt;	
	private Date policy_start_date;
	private Date policy_exp_date;
	
	@ManyToOne
	@JoinColumn(name="customer_code",nullable=false)
	private Customer customer;
	
	
	public Policy() {
		super();
	}


	public String getPolicy_no() {
		return policy_no;
	}


	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getNext_premium_date() {
		return next_premium_date;
	}


	public void setNext_premium_date(Date next_premium_date) {
		this.next_premium_date = next_premium_date;
	}


	public Date getPurchase_date() {
		return purchase_date;
	}


	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}


	public String getFrequency() {
		return frequency;
	}


	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}


	public String getPremiun_amt() {
		return premiun_amt;
	}


	public void setPremiun_amt(String premiun_amt) {
		this.premiun_amt = premiun_amt;
	}


	public Date getPolicy_start_date() {
		return policy_start_date;
	}


	public void setPolicy_start_date(Date policy_start_date) {
		this.policy_start_date = policy_start_date;
	}


	public Date getPolicy_exp_date() {
		return policy_exp_date;
	}


	public void setPolicy_exp_date(Date policy_exp_date) {
		this.policy_exp_date = policy_exp_date;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
}
