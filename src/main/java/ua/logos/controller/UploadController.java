package ua.logos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadController {
	
	@GetMapping("/upload-form")
	public String showUploadForm() {
		
		return "";
	}

}
