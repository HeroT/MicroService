package com.peihao.nba.match.repository;

import com.peihao.nba.match.domain.PlayerMatch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by TPH on 2017/6/25.
 */
@Mapper
@Repository
public interface PlayerMatchRepository {
    PlayerMatch findOne(@Param("id") Long id);
}
