<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<link rel="stylesheet" href="/css/style.css">

<body>
<jsp:include page="../bar/navibar.jsp"/>
<table>
    <form:form method="post" modelAttribute="item">
        <form:hidden path="id"/>
        <tr>
            <th>Name</th>
            <td><form:input path="name"/><br>
                <form:errors path="name" cssClass="error-class"/></td>
        </tr>
        <tr>
            <th>Quantity:</th>
            <td><form:input path="quantity"/><br>
                <form:errors path="quantity" cssClass="error-class"/></td>
        </tr>
        <tr>
            <th>Jednostka:</th>
            <td><form:select itemValue="id" itemLabel="name" path="quantityType.id" items="${quantityTypes}"/><br></td>
        </tr>
        <tr>
            <th>Kategoria:</th>
            <td><form:select itemValue="id" itemLabel="name" path="category.id" items="${categories}"/><br></td>
        </tr>
        <tr>
            <th>Regał:</th>
            <td><form:select itemValue="id" itemLabel="name" path="rack.id" items="${racks}"/><br></td>
        </tr>
        <tr>
            <th>Magazyn:</th>
            <td><form:select itemValue="id" itemLabel="name" path="warehouse.id" items="${warehouses}"/><br></td>
        </tr>
        <tr>
<%--            <th><button onclick="location.href='/app/items/delete/${item.id}'" type="button" id="delete">delete</button></th>--%>
            <th></th>
            <td><input type="submit" value="submit"></td>
        </tr>

    </form:form>
</table>
</body>
</html>
