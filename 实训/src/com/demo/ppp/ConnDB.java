package com.demo.ppp;
import java.sql.*;

public class ConnDB {
	public Connection conn=null;
	public Statement stmt=null;
	public ResultSet rs=null;
	private static String dbDriver="com.mysql.jdbc.Driver";
	private static String dbUrl="jdbc:mysql://localhost:3306/aaa?characterEncoding=utf-8";
	private static String dbUser="root";
	private static String dbPwd="root";

	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName(dbDriver);
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	if (conn == null) 
    	{
      		System.err.println("数据库连接失败");
    	}		
		return conn;
	}
	//查询
	public ResultSet doQuery(String sql)
	{
		try
		{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	//更新数据
	public int doUpdate(String sql)
	{
		int result=0;
		try
		{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			result=stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			result=0;
		}
		return result;
	}
	//关闭数据库
	 public void closeConnection()
	{
		try
		{
			if (rs!=null)
				rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (stmt!=null)
				stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (conn!=null)
				conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
