package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  @Autowired
  private JavaMailSender javaMailSender;

  public Boolean sendEmail() throws Exception {

    try {
      SimpleMailMessage smm = new SimpleMailMessage();
      smm.setFrom("masaigradigi@gmail.com");
      smm.setTo("nehasahu272727@gmail.com");
      smm.setSubject("testing mail");
      smm.setText("hello, this is testing mail");

      javaMailSender.send(smm);
    } catch (Exception e) {
      return false;
    }

    return true;
  }

}