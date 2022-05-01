<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 30.04.22
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fieldset>
        <legend>Login</legend>
        ${message} <br>
        <form method="post" action="account">
            <table cellpadding="2" cellspacing="2">
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>Enter</td>
                    <td><input type="submit" name="Login"></td>
                </tr>
            </table>
        </form>
    </fieldset>
</body>
</html>
