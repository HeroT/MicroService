package com.peihao.nba.player.controller;

import com.peihao.nba.player.annotation.Page;
import com.peihao.nba.player.client.MatchServiceClient;
import com.peihao.nba.player.domain.Player;
import com.peihao.nba.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by LijingYe on 2017/06/24.
 */
@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private MatchServiceClient matchServiceClient;

    @Page
    @RequestMapping(path = "/players", method = RequestMethod.GET)
    public Object getPlayers(@ModelAttribute Player condition) {
        return playerService.getPlayers(condition);
    }

    @RequestMapping(path = "/players/{id}", method = RequestMethod.GET)
    public Object getPlayerById(@PathVariable String id) {
//        Map<String, Object> map= matchServiceClient.getMatch("151599");
//        return map;
        return playerService.getPlayerById(id);
    }


}
