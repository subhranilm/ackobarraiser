package com.example.demo;

import com.example.demo.repository.CreateTeamRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class CreateTeamRepositoryTest
{
	CreateTeamRepository createTeamRepository;
	@BeforeEach
 	void setup()
	{
		createTeamRepository = new CreateTeamRepository();
	}

	@Test
	void testCreateTeam()
	{
		long id = createTeamRepository.createTeam("team1");
		Assertions.assertEquals(true, Objects.nonNull(createTeamRepository.getTeambyId(id)));
	}

}
