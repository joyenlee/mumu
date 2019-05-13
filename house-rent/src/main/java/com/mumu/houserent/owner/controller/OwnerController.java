package com.mumu.houserent.owner.controller;

import java.io.IOException;

import javax.servlet.http.Part;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mumu.houserent.owner.controller.dto.RegisterHouseRequest;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	final static Logger logger = LoggerFactory.getLogger(OwnerController.class);
	
	@PostMapping("/registerHouseByManual.action")
	@ResponseBody
	public String registerHouseByManual(@Valid RegisterHouseRequest req) {
		logger.info(req.toString());
		
		
		return "OK";
	}
	
	@PostMapping("/registerHouseByPhoto.action")
	@ResponseBody
	public String registerHouseByPhoto(@RequestPart("pic") Part[] pics) throws IOException {
		
		for (Part pic : pics) {
			logger.info(pic.getName());
			logger.info(pic.getSubmittedFileName());
			pic.write("E:\\" + pic.getSubmittedFileName());
		}
		
		
		
		return "OK";
	}
}
