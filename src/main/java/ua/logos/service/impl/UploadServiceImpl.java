package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.UploadFile;
import ua.logos.repository.UploadRepository;
import ua.logos.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

	@Autowired
	private UploadRepository uploadRepository;
	@Override
	public void saveFile(UploadFile file) {
		// TODO Auto-generated method stub
		uploadRepository.save(file);
	}

	@Override
	public UploadFile getFileById(int id) {
		// TODO Auto-generated method stub
		return uploadRepository.getOne(id);
	}

	@Override
	public List<UploadFile> getAllFiles() {
		// TODO Auto-generated method stub
		return uploadRepository.findAll();
	}

}
