package com.demo.lll;

import com.demo.aaa.Users;
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
import java.util.ArrayList;

@WebServlet(name = "DisplayServlet",value = "/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        ArrayList <Users> list=new ArrayList<Users>();
        String sql="select * from users ";
        ResultSet rs=conn.doQuery(sql);
        try {
            while (rs.next()) {
                Users user=new Users();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                list.add(user);
            }
            session.setAttribute("list",list);
            response.sendRedirect("1/zhanshi.jsp");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
