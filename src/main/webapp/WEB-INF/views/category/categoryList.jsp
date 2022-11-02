<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<jsp:include page="../bar/navibar.jsp"/>
<jsp:include page="../bar/utilbar.jsp"/>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th></th>

    </tr>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.id}</td>
            <td>${category.name}</td>
            <td>
                <div class="btn-group">
                    <button onclick="location.href='/app/categories/delete/${category.id}'" type="button" id="delete">delete</button>
                    <button onclick="location.href='/app/categories/edit/${category.id}'" type="button">edit</button>
                </div>

            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>