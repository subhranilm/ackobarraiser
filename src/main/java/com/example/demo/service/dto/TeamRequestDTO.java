package com.example.demo.service.dto;

import com.example.demo.pojo.Developer;

import java.util.List;

public class TeamRequestDTO
{
    private String name;
    private List<Developer> developerList;

    public TeamRequestDTO(String name, List<Developer> developerList)
    {
        this.name = name;
        this.developerList = developerList;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Developer> getDevelopersList()
    {
        return developerList;
    }

    public void setDevelopersList(List<Developer> developerList)
    {
        this.developerList = developerList;
    }
}
