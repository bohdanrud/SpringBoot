package ua.logos.service;

import java.util.List;

import ua.logos.entity.Country;

public interface CountryService {

	void saveCountry(Country country);
	
	Country findCountryById(int id);
	
	List<Country> findAllCountries();
}
