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
        <th>number</th>
        <th>level</th>
        <th>place</th>
        <th>name</th>
        <th>CRUD</th>

    </tr>
    <c:forEach items="${racks}" var="rack">
        <tr>
            <td>${rack.id}</td>
            <td>${rack.number}</td>
            <td>${rack.level}</td>
            <td>${rack.place}</td>
            <td>${rack.name}</td>
            <td>
                <div class="btn-group">
                    <button onclick="location.href='/app/racks/delete/${rack.id}'" type="button" id="delete">delete</button>
                    <button onclick="location.href='/app/racks/edit/${rack.id}'" type="button">edit</button>
                </div>

            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>