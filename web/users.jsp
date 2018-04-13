<%--
  Created by IntelliJ IDEA.
  User: zagnoyko_v_v
  Date: 05.04.2018
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <c:forEach items = "${list}" var = "user">
        <tr>
            <td>${user.id}</td>
            <td><c:out value = "${user.user_name}"/></td>
            <td><c:out value = "${user.password}"/></td>
        </tr>
    </c:forEach>
</table>

<form action="/students" method="post">
    <input type="submit" name="button" value="Students">
</form>
</body>
</html>
