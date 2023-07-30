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

@WebServlet(name = "DeleteServlet",value = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String sql="select * from users where username='"+username+"'";
        ResultSet rs=conn.doQuery(sql);
        try {
            if (!rs.next()) {1
            //Alt+回车
                session.setAttribute("errormsg","用户不存在，不能删除!");
                response.sendRedirect("1/delete.jsp");
            }
            else {
                String sql2="delete from users where username='"+username+"'";
                int i=conn.doUpdate(sql2);
                if(i>0){
                    response.sendRedirect("1/3.jsp");
                }
                else {
                    session.setAttribute("errormsg","删除失败！");
                    response.sendRedirect("1/delete.jsp");
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
