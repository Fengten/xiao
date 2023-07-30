
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>展示界面</title>
    <style type="text/css">

        .auto-style1 {
            width: 1350px;
            height: 938px;
            border-style: solid;
            border-width: 1px;
            background-color: #ffa25d;
        }
        .auto-style5 {
            height: 196px;
        }
        .auto-style2 {
            color: #000066;
            text-align: center;
        }
        .auto-style10 {
            font-weight: 700;
            color: #00CC00;
            font-size: xx-large;
        }
        .auto-style7 {
            height: 48px;
        }
        .auto-style9 {
            height: 107px;
        }
        .auto-style11 {
            height: 413px;
            width: 269px;
            border-style: solid;
            border-width: 1px;
            background-color: #00FFFF;
        }
        .auto-style13 {
            text-align: center;
            color: #CC00FF;
        }
        .auto-style14 {
            height: 64px;
            text-align: center;
        }
        .auto-style15 {
            text-align: center;
            font-size: xx-large;
            color: #CC00FF;
            height: 123px;
        }
        .auto-style16 {
            color: #CC00FF;
        }
    </style>
</head>
<body style="color: #FFFF00; background-color: #66FF33">

<table align="center" border="1" class="auto-style1">
    <tr>
        <td colspan="4" style="text-align: center">
            <img alt="" src="../img/Gif_622.gif" style="height: 271px; width: 1378px;" /></td>
    </tr>
    <tr>
        <td colspan="4" style="text-align: center" class="auto-style5">
            <h1 class="auto-style2"><em>游戏天堂</em></h1>
            <p class="auto-style2">
                <a href="/index.jsp">返回主页</a>&nbsp;&nbsp;&nbsp;
                <a href="xiugai.jsp">修改用户</a>&nbsp;&nbsp;&nbsp;
                <a href="find.jsp">查询用户</a>&nbsp;&nbsp;&nbsp;
                <a href="1.jsp">注 册</a><br>
    <tr>
        <td style="text-align: center" rowspan="2">
            <img alt="" src="../img/4.jpg" style="height: 409px; width: 552px;" /></td>
        <td rowspan="2">
            <form action="../DisplayServlet1" method="post">
                <table align="center" class="auto-style11">
                    <tr>
                        <td class="auto-style15" colspan="2">展示界面</td>
                    </tr>
                    <tr align="center">
                        <td width="100">序  号</td>
                        <td width="100">用户名</td>
                        <td width="100">密  码</td>
                    </tr>
                    <c:forEach items="${list}" var="user" varStatus="vs">
                        <tr align="center">
                            <td>${user.getId()}</td>
                            <td>${user.getUsername()}</td>
                            <td>${user.getPassword()}</td>
                        </tr>
                        </c:forEach>
                    <tr  align="center">
                        <td class="auto-style15">
                            <a href="3.jsp">返回用户主页</a>
                        </td>
                    </tr>

                    </tr>


                </table>

            </form>
        </td>
        <td>
            <img alt="" src="../img/3.jpg" style="height: 200px; width: 270px;" /></td>
        <td>
            <img alt="" src="../img/66.jpg" style="height: 200px; width: 270px;" /></td>
    </tr>
    <tr>
        <td class="auto-style7">
            <img alt="" src="../img/5.jpg" style="height: 200px; width: 270px;" /></td>
        <td class="auto-style7">
            <img alt="" src="../img/2.jpg" style="height: 200px; width: 270px;" /></td>
    </tr>
    <tr>
        <td colspan="4" style="text-align: center; font-weight: 700; color: #CC33FF" class="auto-style9">版权：软件2203 林某</td>
    </tr>
</table>

</body>
</html>