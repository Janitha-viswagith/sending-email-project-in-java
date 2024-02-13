package com.vishwacodes.SpringEmailDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private emailService service;

	public static void main(String[] args) {

		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {

		service.sendEmail("vishwagithjanith@gmail.com", "Test Email I am sending using Spring Boot and Mail." +
				"i am using gmail .i am janith vishwagith. ", "This is a test email sent using Spring Boot and Mail");
	}

}
