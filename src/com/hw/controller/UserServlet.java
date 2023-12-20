package com.hw.controller;

import com.hw.dao.UserDao;
import com.hw.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/*
* 1.接收用户请求
* 2.处理用户请求 调用UserDao中的loginUser方法
* 3.响应用户请求
* */
@WebServlet("/user")//该servlet通过在浏览器地址栏上输入/user来进行访问,默认执行该类中的service方法
public class UserServlet extends HttpServlet {
    //HttpServletRequest代表用户请求对象
    //HttpServletResponse代表响应用户请求对象
    UserDao userDao = new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置请求对象的编码方式
        req.setCharacterEncoding("utf-8");
//        System.out.println("您成功的访问到了UserServlet中的service方法");
//
//        resp.setContentType("text/html;charset=utf-8");//设置响应的编码方式
//        PrintWriter writer = resp.getWriter();
//        writer.print("HelloWord!!!");
        String userAccount = req.getParameter("userAccount");
        String userPassword = req.getParameter("userPassword");
//        System.out.println(userAccount);
//        System.out.println(userPassword);
        //调用UserDao对象中的loginUser方法进行登录
        User user = userDao.loginUser(userAccount, userPassword);
        if(user != null){
            //登录成功
            //把用户登录信息存储到session对象中（以键值对的方式进行存储的）
            HttpSession session = req.getSession();
            session.setAttribute("loginUser",user);
            //跳转到登录成功的页面index.html
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }else {
            //登录失败
            //跳转到登录页面login.jsp
            String tips = URLEncoder.encode("用户名或密码错误！！！" ,"utf-8");
            resp.sendRedirect(req.getContextPath()+"/login.jsp?tips="+tips);

        }
    }
}
