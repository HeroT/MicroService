package com.peihao.nba.player.service;

import com.peihao.nba.player.domain.Player;
import com.peihao.nba.player.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TPH on 2017/6/24.
 */
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Object getPlayerById(String id) {
        return playerRepository.findOne(Long.valueOf(id));
    }

    public List<Player> getPlayers(Player condition){
        List<Player> playerList= playerRepository.findByCondition(condition);
        for(int i=0;i<playerList.size();i++)
        {
            String sbirthday="19"+playerList.get(i).getBirthday().getYear()+"/"+playerList.get(i).getBirthday().getMonth()+"/"+playerList.get(i).getBirthday().getDate();
            playerList.get(i).setSbirthday(sbirthday);
        }
        return playerList;
    }


}
