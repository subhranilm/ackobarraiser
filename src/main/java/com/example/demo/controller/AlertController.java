package com.example.demo.controller;

import com.example.demo.pojo.Developer;
import com.example.demo.pojo.Team;
import com.example.demo.service.AlertService;
import com.example.demo.service.DeveloperService;
import com.example.demo.service.TeamService;
import com.example.demo.service.dto.AlertRequestDTO;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/alert")
public class AlertController
{
    @Autowired
    TeamService teamService;
    @Autowired
    DeveloperService developerService;
    @Autowired
    AlertService alertService;

    @PostMapping("/receive")
    public ResponseEntity sendAlert(@RequestBody AlertRequestDTO alertRequestDTO) throws JSONException
    {
        Team team = teamService.getTeamById(alertRequestDTO.getTeamId());
        if (Objects.nonNull(team))
        {
            Developer developer = developerService.getRandomDeveloperByTeamId(alertRequestDTO.getTeamId());
            HttpStatus responseCode =  alertService.receiveAlert(developer.getPhoneNumber(), alertRequestDTO.getMessage());
            if(HttpStatus.OK.equals(responseCode))
                ResponseEntity.ok("Alert sent");
        }
        return (ResponseEntity) ResponseEntity.badRequest();
    }

}
