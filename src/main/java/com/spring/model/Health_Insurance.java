package com.spring.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="Health_Insurance")  
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
public class Health_Insurance extends Policy{
	
	
	private String sum_insured;

	public String getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(String sum_insured) {
		this.sum_insured = sum_insured;
	}
	
	
	
}
