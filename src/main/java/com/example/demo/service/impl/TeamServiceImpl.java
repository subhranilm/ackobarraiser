package com.example.demo.service.impl;

import com.example.demo.pojo.Team;
import com.example.demo.repository.CreateTeamRepository;
import com.example.demo.repository.TeamRepository;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService
{
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private CreateTeamRepository createTeamRepository;

    @Override
    public Team getTeamById(long id)
    {
        if(teamRepository.isValidTeamId(id))
        {
           return createTeamRepository.getTeambyId(id);
        }
        /*
        throw exceptions rather than new object
         */
        return new Team();
    }
}
