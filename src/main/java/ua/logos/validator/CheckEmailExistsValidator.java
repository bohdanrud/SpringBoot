package ua.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.logos.repository.LoginDataRepository;

@Component
public class CheckEmailExistsValidator implements ConstraintValidator<CheckEmailExists, String>{

	@Autowired
	LoginDataRepository loginDataRepository;

	@Override
	public void initialize(CheckEmailExists constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(email == null) {
			return false;
		}
		if (loginDataRepository.findLDByEmail(email) != null) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
