package com.gxa.utils;

import com.alibaba.druid.support.json.JSONUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.gxa.service.user.UserService;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtInterceptor implements HandlerInterceptor {

    @Resource
    private UserService userService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从 http 请求头中取出 token
        String token = request.getHeader("token");
        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        if (StringUtils.isBlank(token)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSONUtils.toJSONString(R.error("无token，请重新登录")));
            return false;
        }
        // 验证
        String token1 = this.userService.queryToken(token);

        if (!JwtUtil.checkToken(token)){
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json;charset=utf-8");
                response.getWriter().write(JSONUtils.toJSONString(R.error(401,"token失效,请重新登录")));
                return false;
            } else if (token1==null||token1.equals("")){
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json;charset=utf-8");
                response.getWriter().write(JSONUtils.toJSONString(R.error(401,"token可能被篡改,请重新登录")));
                return false;
            }

        return true;
    }
}
