package com.everis.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HolaEverisApplication {

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "Hola Everis";
	}
	public static void main(String[] args) {
		SpringApplication.run(HolaEverisApplication.class, args);
	}
}
