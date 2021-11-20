package com.example.demo.service;

import org.json.JSONException;
import org.springframework.http.HttpStatus;

public interface AlertService
{
    public HttpStatus receiveAlert(long phoneNumber, String message) throws JSONException;
}
