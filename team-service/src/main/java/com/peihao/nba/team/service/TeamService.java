package com.peihao.nba.team.service;

import com.peihao.nba.team.domain.Team;
import com.peihao.nba.team.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TPH on 2017/6/25.
 */
@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getTeams()
    {
        return teamRepository.findAll();
    }

    public Team getTeamByName(String name)
    {
        return teamRepository.findOneByName(name);
    }

    public Team getTeamById(String id)
    {
        return teamRepository.findOneById(id);
    }

    public String getTeamNameById(String id)
    {
        return teamRepository.findOneById(id).getName();
    }


}
