package ua.logos.formatter;


import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ua.logos.entity.Country;

@Component
public class CountryFormatter implements Formatter<Country>{

	@Override
	public Country parse(String objId, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Parse: " + objId);
		Country country = new Country();
		country.setId(Integer.valueOf(objId));
		return country;
	}
	
	@Override
	public String print(Country country, Locale arg1) {
		// TODO Auto-generated method stub
		System.out.println("Print: " + country.getId());
		return String.valueOf(country.getId());
	}

}
