package com.example.demo.service;

import com.example.demo.pojo.Developer;
import com.example.demo.pojo.Team;

import java.util.List;


public interface DeveloperService
{
    public Developer getRandomDeveloperByTeamId(long id);
}
