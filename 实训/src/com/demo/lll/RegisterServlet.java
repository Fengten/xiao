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

@WebServlet(name = "RegisterServlet",value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sql="select * from users where username='"+username+"'";
        ResultSet rs=conn.doQuery(sql);
        try {
            if (rs.next()) {  //Alt+回车
                session.setAttribute("errormsg","用户已经存在，不能重复注册!");
                response.sendRedirect("1/1.jsp");
            }
            else {
                String sql2="insert into users (username,password) values ('"+username+"','"+password+"')";
                int i=conn.doUpdate(sql2);
                if(i>0){
                    session.setAttribute("username",username);
                    response.sendRedirect("1/2.jsp");
                }
                else {
                    session.setAttribute("errormsg","注册失败！");
                    response.sendRedirect("1/1.jsp");
                }
            }
        }catch (SQLException e) {
                e.printStackTrace();
        }

    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
