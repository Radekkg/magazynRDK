<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<jsp:include page="../bar/navibar.jsp"/>
<jsp:include page="../bar/warehousebar.jsp"/>
<table>
  <tr>
    <th>Id</th>
    <th>Nazwa</th>
    <th>Ilość</th>
    <th>Jednostka</th>
    <th>Kategoria</th>
    <th>Miejsce</th>
    <th>Magazyn</th>
    <th>QR Code</th>
    <th>Opis</th>
    <th></th>



  </tr>
  <c:forEach items="${itemsByName}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.quantity}</td>
      <td>${item.quantityType}</td>
      <td>${item.category}</td>
      <td>${item.rack}</td>
      <td>${item.warehouse}</td>
      <td>${item.qrCode}</td>
      <td>${item.description}</td>



      <td>
          <%--                <a href="<c:url value="/article/delete/${article.id}"/>">delete</a>--%>
          <%--                <a href="<c:url value="/article/edit/${article.id}"/>">edit</a>--%>
      </td>
    </tr>

  </c:forEach>

</table>
</body>
</html>
