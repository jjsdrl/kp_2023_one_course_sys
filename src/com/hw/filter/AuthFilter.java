package com.hw.filter;


import com.hw.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;

@WebFilter("/*")//拦截所有的用户请求
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //子父接口的关系 把servletRequest强制转换为HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取到用户请求的路径
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        if (requestURI.endsWith("login.jsp")||requestURI.endsWith(".css")||
                requestURI.endsWith("img")||requestURI.endsWith(".js")||
                requestURI.endsWith("user")){
            //放行请求
            filterChain.doFilter(request,response);
        }else {
            //验证用户是否登录
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("loginUser");
            if(user != null){
                //登录了
                filterChain.doFilter(request,response);
            }else{
                //未登录
                String tips = URLEncoder.encode("您没有权限访问，请先登录!!!","utf-8");
                response.sendRedirect(request.getContextPath()+"/login.jsp?tips="+tips);
            }
        
        }

    }

    @Override
    public void destroy() {

    }
}
