package com.peihao.nba.match.repository;

import com.peihao.nba.match.domain.PlayerAvgMatch;
import com.peihao.nba.match.domain.PlayerEachMatch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TPH on 2017/6/25.
 */
@Mapper
@Repository
public interface PlayerEachMatchRepository {
    List<PlayerEachMatch> findAllMatchByName(@Param("name") String name);
    List<PlayerEachMatch> findAllMatchById(@Param("id") String id);
    List<PlayerAvgMatch> findTopPlayers(@Param("type") String type);
    List<PlayerEachMatch> findPlayerLeastMatchById(@Param("id") String id);
}
