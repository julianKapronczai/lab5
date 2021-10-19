<%-- 
    Document   : homePage
    Created on : Oct 12, 2021, 1:00:44 PM
    Author     : JRKap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <div>
            <p>
                Welcome ${username} to your home. 8)
            </p>
        </div>

        <a href="login?logout">logout</a>
    </body>
</html>
