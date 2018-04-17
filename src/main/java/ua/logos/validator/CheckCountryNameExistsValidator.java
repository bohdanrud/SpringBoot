package ua.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.logos.repository.CountryRepository;

@Component
public class CheckCountryNameExistsValidator implements ConstraintValidator<CheckCountryNameExists, String>{

	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public void initialize(CheckCountryNameExists constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String countryName, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(countryName == null) {
			return false;
		}
		if(countryRepository.findCountryByName(countryName) != null) {
			return false;
		} else {
			return true;
		}
	}

	
	
}
