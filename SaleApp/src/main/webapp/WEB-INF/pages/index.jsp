<%-- 
    Document   : index
    Created on : Mar 27, 2024, 1:32:18 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <ul>
            <c:forEach items="${categories}" var="c">
                <li>
                    ${c.name}
                    <c:forEach items="${products}" var="c">
                    <li>
                        ${c.name}
                    </li>
                </c:forEach>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
