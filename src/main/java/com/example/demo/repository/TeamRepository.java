package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TeamRepository
{
    @Autowired
    private CreateTeamRepository createTeamRepository;

    public boolean isValidTeamId(long id)
    {
        return Objects.nonNull(createTeamRepository.getTeambyId(id));
    }
}
