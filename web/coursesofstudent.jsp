<%--
  Created by IntelliJ IDEA.
  User: zagnoyko_v_v
  Date: 06.04.2018
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Courses</title>
</head>
<body>
<h4>
    ${pageContext.page}
</h4>
<table>
    <c:forEach items="${list}" var="course">
        <tr>

            <form name="id" method="post">
                <td><c:out value="${course.id}"/></td>
            </form>
            <form name="name_course" method="post">
                <td><c:out value="${course.name_course}"/></td>
            </form>
        </tr>
    </c:forEach>
</table>
</body>
</html>