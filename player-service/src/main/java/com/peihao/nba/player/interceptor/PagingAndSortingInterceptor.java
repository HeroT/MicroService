package com.peihao.nba.player.interceptor;

import com.peihao.nba.player.utility.ThreadLocalKey;
import com.peihao.nba.player.utility.ThreadLocalUtility;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LijingYe on 2017/06/24.
 */
@Component
public class PagingAndSortingInterceptor implements HandlerInterceptor {
    @Value("${page.number.queryString}")
    private String pageNumberQueryString;
    @Value("${page.size.queryString}")
    private String pageSizeQueryString;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object
            o) throws Exception {
        ThreadLocalUtility.put(ThreadLocalKey.QUERY_PAGE_NUMBER, httpServletRequest.getParameter
                (pageNumberQueryString));
        ThreadLocalUtility.put(ThreadLocalKey.QUERY_PAGE_SIZE, httpServletRequest.getParameter(pageSizeQueryString));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {

    }
}
