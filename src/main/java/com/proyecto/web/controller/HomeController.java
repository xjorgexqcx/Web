package com.proyecto.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Entro a home");
		return "public/home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2() {
		logger.info("Entro a home");
		return "public/blog";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		logger.info("Entro a contactos");
		return "public/contact";
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String blog() {
		logger.info("Entro a blog");
		return "public/blog";
	}
	
	
}
