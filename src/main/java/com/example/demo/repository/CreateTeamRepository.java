package com.example.demo.repository;

import com.example.demo.pojo.Developer;
import com.example.demo.pojo.Team;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CreateTeamRepository
{
    private static Map<Long, Team> teamMap;
    private static Map<Long, List<Developer>> developerMap;

    static{
        teamMap = new HashMap<>();
        developerMap = new HashMap<>();
    }

    public long createTeam(String name)
    {
        long id = System.currentTimeMillis();
        teamMap.put(id, new Team(id, name));
        return id;
    }

    public List<Developer> addDevelopers(Long id, List<Developer> developerList)
    {
        return developerMap.put(id,developerList);
    }

    public List<Developer> getDevelopersByTeamId(long id)
    {
        return developerMap.get(id);
    }

    public Team getTeambyId(long id)
    {
        return teamMap.get(id);
    }
}
