package com.spring.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="Motor_Insurance")  
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
public class Motor_Insurance extends Policy{
	

	private String vehicle_Red_no;
	private String engine_no;
	private String purchse_value;
	
	public String getVehicle_Red_no() {
		return vehicle_Red_no;
	}
	public void setVehicle_Red_no(String vehicle_Red_no) {
		this.vehicle_Red_no = vehicle_Red_no;
	}
	public String getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}
	public String getPurchse_value() {
		return purchse_value;
	}
	public void setPurchse_value(String purchse_value) {
		this.purchse_value = purchse_value;
	}
	
	
}
