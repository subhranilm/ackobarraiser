package com.example.demo.service.dto;

import com.example.demo.pojo.Developer;

import java.util.List;

public class AlertRequestDTO
{
    private long teamId;
    private String message;

    public long getTeamId()
    {
        return teamId;
    }

    public void setTeamId(long teamId)
    {
        this.teamId = teamId;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public AlertRequestDTO(long teamId, String message)
    {
        this.teamId = teamId;
        this.message = message;
    }
}
