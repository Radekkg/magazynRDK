<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--  <link rel="stylesheet" href="/css/style.css">--%>
</head>

<body>
<jsp:include page="navibar.jsp"/>

<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>quantity</th>
    <th>quantity_type</th>
    <th>warehouse</th>
    <th>CRUD</th>

  </tr>
  <c:forEach items="${items}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.quantity}</td>
      <td>${item.quantityType}</td>
      <td>${item.warehouse}</td>
      <td>
        <div class="btn-group">
        <button onclick="location.href='/app/items/delete/${item.id}'" type="button">delete</button>
        <button onclick="location.href='/app/items/edit/${item.id}'" type="button">edit</button>
        </div>

      </td>
    </tr>

  </c:forEach>

</table>
</body>
</html>