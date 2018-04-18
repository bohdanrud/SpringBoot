package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.LoginData;
import ua.logos.repository.LoginDataRepository;
import ua.logos.service.LoginDataService;
@Service
public class LoginDataServiceImpl implements LoginDataService {

	@Autowired
	LoginDataRepository loginDataRepository;
	
	@Override
	public void saveLoginData(LoginData loginData) {
		// TODO Auto-generated method stub
		loginDataRepository.save(loginData);
	}

	@Override
	public LoginData findLoginDataById(int id) {
		// TODO Auto-generated method stub
		return loginDataRepository.getOne(id);
	}

	@Override
	public List<LoginData> findAllLoginData() {
		// TODO Auto-generated method stub
		return loginDataRepository.findAll();
	}

}
