package com.skillplay.utils;

public enum AppConstants {

    ACTIVE("ACTIVE"),
    ONGOING("ONGOING"),
    CANCELLED("CANCELLED"),
    FINISHED("FINISHED"),
    BANNED("BANNED"),
    DELETED("DELETED"),
    ADMIN("ADMIN"),
    SUCCESS("SUCCESS"),
    UPDATED("UPDATED"),
    ADDED("ADDED"),
    LIMIT_EXCEEDED("LIMIT_EXCEEDED"),
    FAILED("FAILED"),
    INVALID_PASSWORD("INVALID_PASSWORD"),
    USER_NOT_FOUND("USER_NOT_FOUND"),
    ERROR("ERROR"),
    OTP_EXPIRED("OTP_EXPIRED"),
    INVALID_CLIENT_ID("INVALID_CLIENT_ID"),
    INVALID_OTP("INVALID_OTP"),
    EMAIL_TAKEN("EMAIL_TAKEN"),
    USERNAME_TAKEN("USERNAME_TAKEN"),


    PURPOSE_SIGN_UP_OTP("sign_up"),
    PURPOSE_FORGOT_PASSWORD_OTP("forgot_password");

    private final String status;

     AppConstants(String status) {
        this.status = status;
     }

    public String getCode() {
        return status;
    }

    @Override
    public String toString() {
        return this.status;
    }

    public String get(){
        return this.status;
    }

}
