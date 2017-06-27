package com.peihao.nba.match.service;

import com.peihao.nba.match.domain.Match;
import com.peihao.nba.match.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TPH on 2017/6/24.
 */
@Service
public class MatchService {
    private final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match getMatchById(String id)
    {
        return matchRepository.findOne(Long.valueOf(id));
    }

    public List<Match> getMatchesByCondition(Match condition)
    {
        return matchRepository.findByCondition(condition);
    }

    public List<Match> getTeamMatchesById(String id)
    {
        return matchRepository.findMatchesByTeamId(id);
    }


}
