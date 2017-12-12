package com.spring.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="li")  
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
public class Life_Insurance extends Policy{
	
	private String life_cover;
	private String premium_paying_term;
	
	@OneToOne(mappedBy="li", cascade=CascadeType.ALL)
	private Nomine nomine;

	public String getLife_cover() {
		return life_cover;
	}

	public void setLife_cover(String life_cover) {
		this.life_cover = life_cover;
	}

	public String getPremium_paying_term() {
		return premium_paying_term;
	}

	public void setPremium_paying_term(String premium_paying_term) {
		this.premium_paying_term = premium_paying_term;
	}

	public Nomine getNomine() {
		return nomine;
	}

	public void setNomine(Nomine nomine) {
		this.nomine = nomine;
	}
	
	

}
