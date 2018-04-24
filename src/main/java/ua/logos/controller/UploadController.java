package ua.logos.controller;

import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.logos.entity.UploadFile;
import ua.logos.service.UploadService;
import ua.logos.service.utils.CustomFileUtils;

@Controller
public class UploadController {
	
	@Autowired
	private UploadService uploadService;
	
	@GetMapping("/upload-form")
	public String showUploadForm() {
		
		return "upload-form";
	}

//	@PostMapping("/upload-file")
//	public String saveFile(
//			@RequestParam("uploadFile") MultipartFile file
//			) throws IOException {
//		if(!file.isEmpty() && file!=null) {
//			UploadFile uploadFile = new UploadFile();
//			uploadFile.setFileName(file.getOriginalFilename());
//			uploadFile.setFileData(file.getBytes());
//			
//			uploadService.saveFile(uploadFile);
//		}
//		return "redirect:/";
//	}
	
	@PostMapping("/upload-file")
	public String saveFile(
			@RequestParam("uploadFile") MultipartFile file
			) throws IOException {
		if(!file.isEmpty() && file!=null) {
			CustomFileUtils.createImage("images", file);
		}
		return "redirect:/";
	}
	
	@GetMapping("/prewiew-fromdb")
	public String imageFromDB(Model model) {
		
		UploadFile file = uploadService.getFileById(1);
		String encodFile = new String(Base64.encodeBase64(file.getFileData()));
		model.addAttribute("imageSrc", encodFile);
		return "upload-preview";
	}
	
	@GetMapping("/prewiew-fromfs")
	public String imageFromFS(Model model) throws IOException {
		
		String encodFile = CustomFileUtils.getImage("images", "2015-24-Heures-du-Mans--ACA-1524A-DSC-0227_hd.jpg");
		model.addAttribute("imageSrc", encodFile);
		return "upload-preview";
	}
}
