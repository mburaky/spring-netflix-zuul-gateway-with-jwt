package com.justmop.zuulwithjwt.models.api;

public class AuthenticationRequest {

    private String phone;
    private String otp;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String phone, String otp) {
        this.phone = phone;
        this.otp = otp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
