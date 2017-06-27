package com.peihao.nba.player.interceptor;

import com.peihao.nba.player.utility.ThreadLocalUtility;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用于初始化和销毁ThreadLocalUtils的拦截器
 *
 * @author lijing.ye
 * @version 1.0.0
 * @see ThreadLocalUtility
 */
@Component
public class ThreadLocalUtilityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        ThreadLocalUtility.init();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        ThreadLocalUtility.destroy();
    }
}
