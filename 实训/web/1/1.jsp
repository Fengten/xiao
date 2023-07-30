
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>注册界面</title>
    <style type="text/css">

        .auto-style1 {
            width: 1350px;
            height: 938px;
            border-style: solid;
            border-width: 1px;
            background-color: #260000;
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
        .auto-style15 {
            text-align: center;
            font-size: xx-large;
            color: #000000;
            height: 123px;
        }
        .auto-style13 {
            text-align: center;
        }
        .auto-style14 {
            height: 64px;
            text-align: center;
        }
    </style>
</head>
<body style="background-color: #CC3399">

<table align="center" border="1" class="auto-style1">
    <tr>
        <td colspan="4" style="text-align: center">
            <img alt="" src="../img/Gif_622.gif" style="height: 294px; width: 1378px;" /></td>
    </tr>
    <tr>
        <td colspan="4" style="text-align: center; background-color: #FF5050;" class="auto-style5">
            <h1 class="auto-style2"><em>游戏天堂</em></h1>
            <a href="/index.jsp">返回首页</a>&nbsp;&nbsp;&nbsp;
            <a href="2.jsp">登录</a><br>
    <tr>
        <td style="text-align: center" rowspan="2">
            <img alt="" src="../img/Gif_203.gif" style="height: 417px; width: 552px;" /></td>
        <td rowspan="2">
            <form action="../RegisterServlet" >
            <table align="center" class="auto-style11">
                <tr>
                    <td class="auto-style15" colspan="2">注册界面</td>
                </tr>
                <tr>
                    <td class="auto-style13">账号：</td>
                    <td>
                        <input id="Text1" type="text" name="username"/></td>
                </tr>
                <tr>
                    <td class="auto-style13">密码：</td>
                    <td>
                        <input id="Text2" type="text" name="password"/></td>
                </tr>
                <tr>
                    <td class="auto-style14" colspan="2">
                        <input id="Submit1" type="submit" value="注   册" />
                        <br><br>
                        ${errormsg}
                    </td>
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
            <img alt="" src="../img/1920x1080-px-games-heist-payday-steam-video-1873671-wallhere.com.jpg" style="height: 200px; width: 270px;" /></td>
        <td class="auto-style7">
            <img alt="" src="../img/39148ebc52c407d2e50509dc5485b6db.jpg" style="height: 200px; width: 270px;" /></td>
    </tr>
    <tr>
        <td colspan="4" style="text-align: center; font-weight: 700; color: #CC33FF" class="auto-style9">版权：软件2203 林某</td>
    </tr>
</table>

</body>
</html>
