package com.peihao.nba.player.repository;

import com.peihao.nba.player.domain.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by LijingYe on 2017/06/24.
 */
@Mapper
@Repository
public interface PlayerRepository {
    List<Player> findAll();

    List<Player> findByCondition(@Param("e") Player e);


    Player findOne(@Param("id") Long id);
}
