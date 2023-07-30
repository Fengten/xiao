package com.demo.lll;

import com.demo.ppp.ConnDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UpdateServlet2",value = "/UpdateServlet2")
public class UpdateServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ConnDB conn=new ConnDB();
        request.setCharacterEncoding("utf-8");
        String id=request.getParameter("id");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sql="update users set username='"+username+"',password='"+password+"' where id='"+id+"'";
        int i=conn.doUpdate(sql);
        if(i>0){
            response.sendRedirect("1/3.jsp");
        }
        else {
            session.setAttribute("errormsg","修改失败！");
            response.sendRedirect("1/xiugai.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
