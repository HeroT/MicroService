package com.peihao.nba.player.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by TPH on 2017/6/25.
 */
@FeignClient(name = "match-service")
public interface MatchServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/matches/{id}")
    Map<String, Object> getMatch(@PathVariable("id") String id);
}
