package com.peihao.nba.match.repository;

import com.peihao.nba.match.domain.Match;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TPH on 2017/6/24.
 */
@Mapper
@Repository
public interface MatchRepository {
    List<Match> findAll();
    Match findOne(@Param("id") Long id);
    List<Match> findByCondition(@Param("e") Match e);
    List<Match> findMatchesByTeamId(@Param("id") String id);
}
