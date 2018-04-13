<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: zagnoyko_v_v
  Date: 20.03.2018
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<h2>
    Время = <%=new java.util.Date()%>
    <% out.println("Out Println()");%>

</h2>
<h3><% if (request.getAttribute("error") != null) {%>
    ${error}
    <%}%>
</h3>


<form action="/login" method="post">
    <div>
        <h4>Login</h4>
        <input type="text" name="login" size="20"
               maxlength="50">
        <h4>Password</h4>
        <input type="password" name="password" size="20"
               maxlength="50">
    </div>

    <div>
        <input type="submit" name="button" value="Log in">
    </div>

</form>

<form action="/registration" method="post">

    <input type="submit" name="button" value="Registration">

</form>


</body>

</html>
