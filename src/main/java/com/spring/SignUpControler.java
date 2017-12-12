package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.SignUp;
import com.spring.service.SignUpService;

@Controller
public class SignUpControler {
	
	private SignUpService signUpService;
	
	@Autowired(required=true)
	@Qualifier(value="signService")
	public void setSignUpService(SignUpService signUpService) {
		this.signUpService = signUpService;
	}
	
	
	@RequestMapping("/signup")
    public void removePerson(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
    		@RequestParam("pwd") String pwd,@RequestParam("email") String email){
		SignUp s=new SignUp();
		s.setEmail(email);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setPwd(pwd);
		this.signUpService.doSignUp(s);
       
    }
	

}
