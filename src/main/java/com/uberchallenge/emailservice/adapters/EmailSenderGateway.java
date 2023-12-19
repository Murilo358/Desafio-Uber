package com.uberchallenge.emailservice.adapters;

public interface EmailSenderGateway  {

    public void sendEmail(String to, String subject, String body);
}
