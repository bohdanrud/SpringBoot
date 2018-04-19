package ua.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.logos.repository.CategoryRepository;

@Component
public class CheckCategoryNameExistsValidator implements ConstraintValidator<CheckCategoryNameExists, String>{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public void initialize(CheckCategoryNameExists constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(name == null) {
			return false;
		}
		if (categoryRepository.findCategoryByName(name) != null) {
			return false;
		} else {
			return true;
		}
	}

	

}
