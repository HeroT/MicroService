package com.peihao.nba.match.service;

import com.peihao.nba.match.domain.PlayerAvgMatch;
import com.peihao.nba.match.domain.PlayerEachMatch;
import com.peihao.nba.match.domain.PlayerMatch;
import com.peihao.nba.match.repository.PlayerEachMatchRepository;
import com.peihao.nba.match.repository.PlayerMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by TPH on 2017/6/25.
 */
@Service
public class PlayerMatchService {

    private final PlayerMatchRepository playerMatchRepository;
    private final PlayerEachMatchRepository playerEachMatchRepository;

    @Autowired
    public PlayerMatchService(PlayerMatchRepository playerMatchRepository, PlayerEachMatchRepository playerEachMatchRepository) {
        this.playerMatchRepository = playerMatchRepository;
        this.playerEachMatchRepository = playerEachMatchRepository;
    }

    public PlayerMatch getPlayerDataById(String id)
    {
        return playerMatchRepository.findOne(Long.valueOf(id));
    }

    public List<PlayerEachMatch> getPlayerAllMatches(String id)
    {
        return playerEachMatchRepository.findPlayerLeastMatchById(id);
    }

    public PlayerAvgMatch getPlayerAvgMatchByName(String name)
    {
        List<PlayerEachMatch> playerEachMatchList=playerEachMatchRepository.findAllMatchByName(name);
        PlayerAvgMatch playerAvgMatch=average(playerEachMatchList);
        playerAvgMatch.setName(name);
        return playerAvgMatch;

    }

    public PlayerAvgMatch getPlayerAvgMatchById(String id)
    {
        List<PlayerEachMatch> playerEachMatchList=playerEachMatchRepository.findAllMatchById(id);
        PlayerAvgMatch playerAvgMatch=average(playerEachMatchList);
        playerAvgMatch.setName(playerEachMatchList.get(0).getName());
        return playerAvgMatch;

    }

    public List<PlayerAvgMatch> getTopPlayers(String type)
    {
        return playerEachMatchRepository.findTopPlayers(type);
    }

    public PlayerAvgMatch average(List<PlayerEachMatch> playerEachMatchList)
    {
        int count = playerEachMatchList.size();
        int score=0;
        int time=0;
        int assist=0;
        int rebound=0;
        int bRebound=0;
        int fRebound=0;
        int shootGoal=0;
        int shootNum=0;
        int block=0;
        int threeNum=0;
        int threeGoal=0;
        int freeGoal=0;
        int freeNum=0;
        int steal=0;
        int fault=0;
        int foul=0;
        int value=0;
        for(int i=0;i<count;i++)
        {
            time=time+playerEachMatchList.get(i).getTime();
            assist=assist+playerEachMatchList.get(i).getAssist();
            block=block+playerEachMatchList.get(i).getBlock();
            bRebound=bRebound+playerEachMatchList.get(i).getbRebound();
            fault=fault+playerEachMatchList.get(i).getFault();
            foul=foul+playerEachMatchList.get(i).getFoul();
            fRebound=fRebound+playerEachMatchList.get(i).getfRebound();
            rebound=rebound+playerEachMatchList.get(i).getRebound();
            shootGoal=shootGoal+playerEachMatchList.get(i).getShootGoal();
            shootNum=shootNum+playerEachMatchList.get(i).getShootNum();
            threeGoal=threeGoal+playerEachMatchList.get(i).getThreeGoal();
            threeNum=threeNum+playerEachMatchList.get(i).getThreeNum();
            freeGoal=freeGoal+playerEachMatchList.get(i).getFreeGoal();
            freeNum=freeNum+playerEachMatchList.get(i).getFreeNum();
            score=score+playerEachMatchList.get(i).getScore();
            steal=steal+playerEachMatchList.get(i).getSteal();
            value=value+playerEachMatchList.get(i).getValue();
        }
        PlayerAvgMatch playerAvgMatch=new PlayerAvgMatch();
        //playerAvgMatch.setName(name);
        double avg_free_num=format(freeNum,count);
        double avg_free_goal=format(freeGoal,count);
        double avg_shoot_num=format(shootNum,count);
        double avg_shoot_goal=format(shootGoal,count);
        double avg_three_num=format(threeNum,count);
        double avg_three_goal=format(threeGoal,count);
        playerAvgMatch.setAssist(format(assist,count));
        playerAvgMatch.setBlock(format(block,count));
        playerAvgMatch.setbRebound(format(bRebound,count));
        playerAvgMatch.setFault(format(fault,count));
        playerAvgMatch.setFoul(format(foul,count));
        playerAvgMatch.setfRebound(format(fRebound,count));
        playerAvgMatch.setFreeGoal(avg_free_goal);
        playerAvgMatch.setFreeNum(avg_free_num);
        playerAvgMatch.setShootGoal(avg_shoot_goal);
        playerAvgMatch.setShootNum(avg_shoot_num);
        playerAvgMatch.setThreeGoal(avg_three_goal);
        playerAvgMatch.setThreeNum(avg_three_num);
        playerAvgMatch.setTime(format(time,count));
        playerAvgMatch.setSteal(format(steal,count));
        playerAvgMatch.setValue(format(value,count));
        playerAvgMatch.setScore(format(score,count));
        playerAvgMatch.setRebound(format(rebound,count));
        playerAvgMatch.setFreeRate(formatDouble(avg_free_goal,avg_free_num));
        playerAvgMatch.setTwoRate(formatDouble(avg_shoot_goal,avg_shoot_num));
        playerAvgMatch.setThreeRate(formatDouble(avg_three_goal,avg_three_num));
        return playerAvgMatch;
    }


    private double format(int sum,int count)
    {
        double res=((double)sum)/count;
        DecimalFormat df = new DecimalFormat("0.0");
        return Double.parseDouble(df.format(res));
    }

    private double formatDouble(double sum,double count)
    {
        double res=sum/count;
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(res));
    }




}
