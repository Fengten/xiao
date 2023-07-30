package com.demo.lll;

import com.demo.ppp.ConnDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sql="select * from users where username='"+username+"' and password='"+password+"'";
        ResultSet rs=conn.doQuery(sql);
        try {
            if (rs.next()) {
                session.setAttribute("username", username);
                response.sendRedirect("1/3.jsp");
            }
            else {
                session.setAttribute("a", "用户名或密码出错，请重新输入！");
                response.sendRedirect("1/2.jsp");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
