package com.example.demo.repository;

import com.example.demo.pojo.Developer;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperRepository
{
    @Autowired
    private CreateTeamRepository createTeamRepository;

    public List<Developer> getDevelopersByTeamId(long id)
    {
        return createTeamRepository.getDevelopersByTeamId(id);
    }
}
