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

    private static String LOGINED_FLAG = "LOGINED_FLAG";

    private static String LOGINED_SUCCESS = "LOGINED_SUCCESS";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("access url info:" + request.getRequestURI());
        String url = request.getRequestURI();
        HttpSession session = request.getSession(false);
        if ("/user/login".equals(url) || "/user/add".equals(url) || "/user/changeVerifiedCode".equals(url) || "/user/toLogin".equals(url) || "/error".equals(url)) {
            return true;
        } else {
            if (session == null || session.getAttribute(LOGINED_FLAG) != LOGINED_SUCCESS) {
                logger.info("session 为 null,或者未登录");
                response.sendRedirect("/user/login");
                return false;
            } else {
                return true;
            }
        }
    }
}
