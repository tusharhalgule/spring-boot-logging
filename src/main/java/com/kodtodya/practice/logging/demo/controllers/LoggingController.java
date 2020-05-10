package com.kodtodya.practice.logging.demo.controllers;

import com.kodtodya.practice.logging.demo.services.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	private Logger logger = LoggerFactory.getLogger(LoggingController.class);

	@Autowired
	private LoggingService loggingService;

	@GetMapping("/log")
	public String controlLogging() {
		return loggingService.log();
	}

}
