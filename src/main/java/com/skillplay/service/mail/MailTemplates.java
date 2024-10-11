package com.skillplay.service.mail;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailTemplates {

    private final EmailService emailService;


    public boolean sendOtpForAccountCreation(String otp, String sendTo){

        String subject = "Your One-Time Password (OTP) for Secure Access";
        String body = "Dear Valued User,\n\n" +
                "We have generated a One-Time Password (OTP) for you: " + otp + ". Please use this code to complete your authentication process.\n\n" +
                "If you did not request an OTP, please disregard this email. For security reasons, do not share your OTP with anyone.\n\n" +
                "Thank you for choosing our service.\n\n" +
                "Best regards,\n" +
                "The GamingArena Team";
         return emailService.sendEmail(sendTo, subject, body);
    }


}