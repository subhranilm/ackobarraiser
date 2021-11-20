package com.example.demo.pojo;

import javax.persistence.*;
import java.util.List;


public class Team
{

    private long id;

    private String name;


    public Team(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Team()
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
