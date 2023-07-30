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

@WebServlet(name = "UpdateServlet1",value = "/UpdateServlet1")
public class UpdateServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String sql="select * from users where username='"+username+"' ";
        ResultSet rs=conn.doQuery(sql);
        try {
            if (rs.next()) {  //Alt+回车
                session.setAttribute("id",rs.getInt("id"));
                session.setAttribute("username", rs.getString("username"));
                session.setAttribute("password", rs.getString("password"));
                response.sendRedirect("1/xiugai2.jsp");
            }
            else {
                session.setAttribute("errormsg", "用户名不存在！");
                response.sendRedirect("1/xiugai.jsp");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
