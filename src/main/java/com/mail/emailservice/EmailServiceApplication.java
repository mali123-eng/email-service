package com.mail.emailservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.emailservice.model.Mail;
import com.mail.emailservice.service.MailService;

@SpringBootApplication
//@EnableDiscoveryClient
//@ComponentScan
public class EmailServiceApplication {

	public static void main(String[] args) {

		 SpringApplication.run(EmailServiceApplication.class, args);

	}

	@RestController
	class mailController {
		private final Logger log = LoggerFactory.getLogger(this.getClass());
		@Autowired
		MailService mailService;

		@PostMapping(value = "/email")
		public void mail(@RequestBody Mail mail) {
			log.info("");
			mailService.sendEmail(mail);

		}

	}

}
