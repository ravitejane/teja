package com.spring.model;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="House_Insurance")  
@AttributeOverrides({  
    @AttributeOverride(name="policy_no", column=@Column(name="policy_no")),  
    @AttributeOverride(name="type", column=@Column(name="type")),  
    @AttributeOverride(name="next_premium_date", column=@Column(name="next_premium_date")) ,  
    @AttributeOverride(name="purchase_date", column=@Column(name="purchase_date")) ,  
    @AttributeOverride(name="premiun_amt", column=@Column(name="premiun_amt")) ,  
    @AttributeOverride(name="frequency", column=@Column(name="frequency")) ,  
    @AttributeOverride(name="policy_start_date", column=@Column(name="policy_start_date")) ,  
    @AttributeOverride(name="policy_exp_date", column=@Column(name="policy_exp_date")) 
}) 
public class House_Insurance extends Policy{
	
	private String building_cost;
	private String appliences_cost;
	private String jewelery_cost;
	
	@OneToMany
	@JoinTable(name="house_insurance_members",joinColumns=@JoinColumn(name="policy_no"),inverseJoinColumns=@JoinColumn(name="member_id"))
	private Set<House_members> hm;

	public String getBuilding_cost() {
		return building_cost;
	}

	public void setBuilding_cost(String building_cost) {
		this.building_cost = building_cost;
	}

	public String getAppliences_cost() {
		return appliences_cost;
	}

	public void setAppliences_cost(String appliences_cost) {
		this.appliences_cost = appliences_cost;
	}

	public String getJewelery_cost() {
		return jewelery_cost;
	}

	public void setJewelery_cost(String jewelery_cost) {
		this.jewelery_cost = jewelery_cost;
	}

	public Set<House_members> getHm() {
		return hm;
	}

	public void setHm(Set<House_members> hm) {
		this.hm = hm;
	}
	
	
	
}
