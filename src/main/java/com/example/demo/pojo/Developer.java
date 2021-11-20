package com.example.demo.pojo;

import javax.persistence.*;


public class Developer
{

    private long id;


    private long teamId;


    private String name;


    private long phoneNumber;

    public Developer(long id, long teamId, String name, long phoneNumber)
    {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Developer()
    {
        super();
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getTeamId()
    {
        return teamId;
    }

    public void setTeamId(long teamId)
    {
        this.teamId = teamId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
