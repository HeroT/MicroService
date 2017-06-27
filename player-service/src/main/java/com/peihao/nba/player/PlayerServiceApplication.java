package com.peihao.nba.player;

import com.peihao.nba.player.interceptor.PagingAndSortingInterceptor;
import com.peihao.nba.player.interceptor.ThreadLocalUtilityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by TPH on 2017/6/24.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class PlayerServiceApplication extends WebMvcConfigurerAdapter {
    private final ThreadLocalUtilityInterceptor threadLocalUtilityInterceptor;
    private final PagingAndSortingInterceptor pagingAndSortingInterceptor;

    @Autowired
    public PlayerServiceApplication(ThreadLocalUtilityInterceptor threadLocalUtilityInterceptor,
                                    PagingAndSortingInterceptor pagingAndSortingInterceptor) {
        this.threadLocalUtilityInterceptor = threadLocalUtilityInterceptor;
        this.pagingAndSortingInterceptor = pagingAndSortingInterceptor;
    }

    public static void main(String[] args) {
        SpringApplication.run(PlayerServiceApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(threadLocalUtilityInterceptor).addPathPatterns("/**");
        registry.addInterceptor(pagingAndSortingInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
