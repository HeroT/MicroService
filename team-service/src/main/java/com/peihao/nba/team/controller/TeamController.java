package com.peihao.nba.team.controller;

import com.peihao.nba.team.domain.Team;
import com.peihao.nba.team.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TPH on 2017/6/25.
 */
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    @RequestMapping(path = "/teams", method = RequestMethod.GET)
    public Object getTeams() {
        return teamService.getTeams();
    }

    @RequestMapping(path = "/teams/name/{name}", method = RequestMethod.GET)
    public Object getTeamByName(@PathVariable String name)
    {
        return teamService.getTeamByName(name);
    }

    @RequestMapping(path = "/teams/id/{id}", method = RequestMethod.GET)
    public Object getTeamById(@PathVariable String id)
    {
        return teamService.getTeamById(id);
    }

    @RequestMapping(value = "/team" ,method = RequestMethod.GET)
    public String getTeamNameById(@RequestParam String id) {
        return teamService.getTeamNameById(id);
    }



}
