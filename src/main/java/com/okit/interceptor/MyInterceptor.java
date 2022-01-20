package com.okit.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:TYZC
 * @Date:2022/1/19
 * @Description:
 */
public class MyInterceptor implements HandlerInterceptor {
        //TODO 在目标方法执行之前
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            Object user = request.getSession().getAttribute("loginUser");
            if (user == null){
            // 未登录,返回登录页面
                request.setAttribute("msg","登录失败，请输入用户名和密码！");
                request.getRequestDispatcher("/index.html").forward(request,response);
                return false;
            }else{
            // 已登录，放行
                return true;
            }
        }

        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        }

        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        }

}
