package org.example.service;

import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailSystem {

  public static void sendEmail(String to, String text, String subject){
    String from = "sender@abc.com";       // sender email
    String host = "127.0.0.1";            // mail server host
    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", host);
    Session session = Session.getDefaultInstance(properties); // default session
    try {
      MimeMessage message = new MimeMessage(session); // email message
      message.setFrom(new InternetAddress(from)); // setting header fields
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
      message.setSubject(subject); // subject line
      message.setText(text);
      Transport.send(message);
    } catch (MessagingException mex){ mex.printStackTrace(); }
  }
}
