package com.example.demo.controller;

import com.example.demo.service.dto.TeamRequestDTO;
import com.example.demo.repository.CreateTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class TeamController
{
    @Autowired
    CreateTeamRepository createTeamRepository;

    @PostMapping("/team")
    public ResponseEntity createTeam(@RequestBody TeamRequestDTO teamRequestDTO)
    {
        String teamName = teamRequestDTO.getName();
        long id = createTeamRepository.createTeam(teamName);
        if (id != 0)
        {
            createTeamRepository.addDevelopers(id, teamRequestDTO.getDevelopersList());

            ResponseEntity.ok();

        }
        return (ResponseEntity) ResponseEntity.badRequest();
    }
}
