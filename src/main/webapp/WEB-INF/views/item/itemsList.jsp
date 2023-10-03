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
<div id="navbar">
    <a href="/app/items/add">Item Add</a>

</div>
<%--<div>--%>
<%--    <form:form method="post" modelAttribute="item">--%>
<%--        <form:input path="name/itemName"/>--%>
<%--        <input type="submit" value="submit">--%>
<%--    </form:form>--%>
<%--</div>--%>
<table>
    <tr>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Ilość</th>
        <th>Jednostka</th>
        <th>Kategoria</th>
        <th>Regał nr</th>
        <th>Poziom</th>
        <th>Miejsce</th>
        <th>Magazyn</th>
        <th>QR Code</th>
        <th>Opis</th>

        <th></th>

    </tr>
    <c:forEach items="${items}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.quantity}</td>
            <td>${item.quantityType}</td>
            <td>${item.category}</td>
            <td>${item.rack.number}</td>
            <td>${item.rack.level}</td>
            <td>${item.rack.place}</td>
            <td>${item.warehouse}</td>
            <td>${item.qrCode}</td>
            <td>${item.description}</td>
            <td>
                <div class="btn-group">
                    <button onclick="location.href='/app/items/delete/${item.id}'" type="button" id="delete">delete
                    </button>
                    <button onclick="location.href='/app/items/edit/${item.id}'" type="button">edit</button>
                </div>

            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>