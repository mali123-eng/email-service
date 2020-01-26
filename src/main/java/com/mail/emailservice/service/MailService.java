package com.mail.emailservice.service;


import org.springframework.stereotype.Service;

import com.mail.emailservice.model.Mail;
@Service
public interface MailService {
    public void sendEmail(Mail mail);
}
