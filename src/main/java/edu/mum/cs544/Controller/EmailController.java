package edu.mum.cs544.Controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.cs544.email.SmtpMailSender;

@RestController
public class EmailController {
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/send-mail")
	public void sendMail() throws MessagingException {
		smtpMailSender.send("laithmehyar@gmail.com", "EA Project", "Hello, This is test email from EA project");
	}
}
