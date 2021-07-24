package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.UploadService;

@CrossOrigin(origins = "http://localhost:4201")
@RestController
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private UploadService uploadService;
	
	@PostMapping
	public void upload(@RequestParam MultipartFile arquivo) {
		uploadService.salvarArquivo(arquivo);
	}
}
