package com.peihao.nba.match.controller;

import com.peihao.nba.match.annotation.Page;
import com.peihao.nba.match.client.TeamService;
import com.peihao.nba.match.domain.Match;
import com.peihao.nba.match.domain.PlayerEachMatch;
import com.peihao.nba.match.service.MatchService;
import com.peihao.nba.match.service.PlayerMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TPH on 2017/6/24.
 */
@RestController
public class MatchController {
    @Autowired
    private MatchService matchService;
    @Autowired
    private PlayerMatchService playerMatchService;
    @Autowired
    private TeamService teamService;

    @RequestMapping(path = "/matches/{id}", method = RequestMethod.GET)
    public Object getMatchById(@PathVariable String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", "200");
        result.put("message", "Hello World!");
        result.put("data", matchService.getMatchById(id));
        return result;
    }

//    @RequestMapping(path = "/matches/player/{id}", method = RequestMethod.GET)
//    public Object getPlayerMatchesById(@PathVariable String id)
//    {
//        return playerMatchService.getPlayerDataById(id);
//    }

//    @RequestMapping(path = "/matches/player/{name}", method = RequestMethod.GET)
//    public Object getPlayerMatchesByName(@PathVariable String name)
//    {
//        return playerMatchService.getPlayerAllMatches(name);
//    }

    @RequestMapping(path = "/matches/avg/name/{name}", method = RequestMethod.GET)
    public Object getPlayerAvgDataByName(@PathVariable String name)
    {
        return playerMatchService.getPlayerAvgMatchByName(name);
    }

    @RequestMapping(path = "/matches/avg/id/{id}", method = RequestMethod.GET)
    public Object getPlayerAvgDataById(@PathVariable String id)
    {
        return playerMatchService.getPlayerAvgMatchById(id);
    }

    @RequestMapping(path = "/matches/top/{type}", method = RequestMethod.GET)
    public Object getTopPlayerAvgDataByType(@PathVariable String type)
    {
        return playerMatchService.getTopPlayers(type);
    }


    @Page
    @RequestMapping(path = "/matches", method = RequestMethod.GET)
    public Object getMatches(@ModelAttribute Match condition) {
        return matchService.getMatchesByCondition(condition);
    }

    @RequestMapping(path = "/matches/player/{id}", method = RequestMethod.GET)
    public Object getPlayerMatchesById(@PathVariable String id)
    {
        List<PlayerEachMatch> playerEachMatchList= playerMatchService.getPlayerAllMatches(id);
        for(int i=0;i<playerEachMatchList.size();i++)
        {
            playerEachMatchList.get(i).setTeam1Name(teamService.getTeamNameById(playerEachMatchList.get(i).getTeam1Id()));
            playerEachMatchList.get(i).setTeam2Name(teamService.getTeamNameById(playerEachMatchList.get(i).getTeam2Id()));
        }
        return playerEachMatchList;
    }

    @RequestMapping(path = "/matches/team/{id}", method = RequestMethod.GET)
    public Object getTeamMatchesById(@PathVariable String id)
    {
        List<Match> matches=matchService.getTeamMatchesById(id);
        for(int i=0;i<matches.size();i++)
        {
            matches.get(i).setTeam1Name(teamService.getTeamNameById(matches.get(i).getTeam1Id().toString()));
            matches.get(i).setTeam2Name(teamService.getTeamNameById(matches.get(i).getTeam2Id().toString()));
            matches.get(i).setsDate(matches.get(i).getDate().toString());
        }
        return matches;

    }


}
