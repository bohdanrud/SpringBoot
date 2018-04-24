package ua.logos.service;

import java.util.List;

import ua.logos.entity.UploadFile;

public interface UploadService {

	void saveFile(UploadFile file);
	
	UploadFile getFileById(int id);
	
	List<UploadFile> getAllFiles();
}
