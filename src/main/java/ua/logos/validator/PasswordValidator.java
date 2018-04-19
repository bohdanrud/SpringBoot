package ua.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.logos.entity.LoginData;
import ua.logos.repository.LoginDataRepository;

@Component
public class PasswordValidator implements ConstraintValidator<Password, LoginData>{

	@Autowired
	LoginDataRepository logDatRep;
	
	@Override
	public void initialize(Password constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(LoginData pass, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
