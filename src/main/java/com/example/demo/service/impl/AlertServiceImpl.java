package com.example.demo.service.impl;

import com.example.demo.service.AlertService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AlertServiceImpl implements AlertService
{
    @Override
    public HttpStatus receiveAlert(long phoneNumber, String message) throws JSONException
    {
        RestTemplate restTemplate = new RestTemplate();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("phone",phoneNumber);
        jsonObject.put("message",message);
        ResponseEntity responseEntity = restTemplate.postForEntity("https://run.mocky.io/v3/fd99c100-f88a-4d70-aaf7-393dbbd5d99f", jsonObject, null);
        return responseEntity.getStatusCode();
    }
}
