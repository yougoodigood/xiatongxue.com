package com.xiayu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Classname LoginInterceptor
 * @Description
 * @Author hello
 * @Date 2019/7/9 10:57
 * @Version 1.0
 **/
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("access url info:" + request.getRequestURI());
        String url = request.getRequestURI();
        if (!"/user/login".equals(url)){
            HttpSession session = request.getSession(false);
            if (session == null){
                logger.info("session 为 null");
                response.sendRedirect("/user/login");
                return false;
            }
        }
        return true;
    }
}
