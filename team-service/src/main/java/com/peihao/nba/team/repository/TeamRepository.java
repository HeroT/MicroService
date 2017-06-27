package com.peihao.nba.team.repository;

import com.peihao.nba.team.domain.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TPH on 2017/6/25.
 */
@Mapper
@Repository
public interface TeamRepository {
    List<Team> findAll();
    Team findOneByName(@Param("name") String name);
    Team findOneById(@Param("id") String id);
}
