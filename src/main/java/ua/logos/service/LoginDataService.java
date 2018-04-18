package ua.logos.service;

import java.util.List;

import ua.logos.entity.LoginData;

public interface LoginDataService {
	
	void saveLoginData(LoginData loginData);
	
	LoginData findLoginDataById(int id);
	
	List<LoginData> findAllLoginData();

}
