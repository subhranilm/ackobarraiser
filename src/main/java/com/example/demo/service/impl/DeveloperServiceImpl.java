package com.example.demo.service.impl;

import com.example.demo.pojo.Developer;
import com.example.demo.repository.DeveloperRepository;
import com.example.demo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DeveloperServiceImpl implements DeveloperService
{
    @Autowired
    DeveloperRepository developerRepository;

    public Developer getRandomDeveloperByTeamId(long id){
        List<Developer> developers =  developerRepository.getDevelopersByTeamId(id);
        int size = developers.size();
        if(size>0)
        {
            int random = new Random().nextInt(size);
            return developers.get(random);
        }
        /**
         * throw exception from here stating that developers are not present for the team
         */
        return new Developer();
    }
}
