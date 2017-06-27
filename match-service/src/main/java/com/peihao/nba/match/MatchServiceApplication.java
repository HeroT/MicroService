package com.peihao.nba.match;

import com.peihao.nba.match.interceptor.PagingAndSortingInterceptor;
import com.peihao.nba.match.interceptor.ThreadLocalUtilityInterceptor;
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
public class MatchServiceApplication extends WebMvcConfigurerAdapter {

    private final ThreadLocalUtilityInterceptor threadLocalUtilityInterceptor;
    private final PagingAndSortingInterceptor pagingAndSortingInterceptor;

    @Autowired
    public MatchServiceApplication(ThreadLocalUtilityInterceptor threadLocalUtilityInterceptor,
                                    PagingAndSortingInterceptor pagingAndSortingInterceptor) {
        this.threadLocalUtilityInterceptor = threadLocalUtilityInterceptor;
        this.pagingAndSortingInterceptor = pagingAndSortingInterceptor;
    }
    public static void main(String[] args) {
        SpringApplication.run(MatchServiceApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(threadLocalUtilityInterceptor).addPathPatterns("/**");
        registry.addInterceptor(pagingAndSortingInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
