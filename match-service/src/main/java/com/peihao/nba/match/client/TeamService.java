package com.peihao.nba.match.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by TPH on 2017/6/26.
 */
@FeignClient("team-service")
public interface TeamService {
    @RequestMapping(method = RequestMethod.GET, value = "/team")
    String getTeamNameById(@RequestParam(value = "id") String id);

}
