<%--
  Created by IntelliJ IDEA.
  User: zagnoyko_v_v
  Date: 20.03.2018
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<h4>
    ${pageContext.page}
</h4>
<table>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>
                <form name="name" method="post">
                        <c:out value="${student.name}"/>
                    <form/>
            </td>
            <td><c:out value="${student.birth_date}"/></td>
            <td>
                <form action="/coursesofstudent" method="post">
                    <input type="submit" name="button" value="Courses">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>