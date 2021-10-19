<%-- 
    Document   : login
    Created on : Oct 12, 2021, 1:00:53 PM
    Author     : JRKap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="login">
                <input type="text" placeholder="enter username here" name="user" id="user" value="${username}" >
                <br>
                <input type="text" placeholder="enter password here" name="pass" id="pass" value="${password}">
                <br>
                <button type="submit">Enter</button>
            </form>
        </div>
    </body>
</html>
