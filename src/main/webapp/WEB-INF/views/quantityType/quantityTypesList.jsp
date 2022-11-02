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
    <th>CRUD</th>

  </tr>
  <c:forEach items="${quantityTypes}" var="quantityType">
    <tr>
      <td>${quantityType.id}</td>
      <td>${quantityType.name}</td>
      <td>
        <div class="btn-group">
          <button onclick="location.href='/app/quantityTypes/delete/${quantityType.id}'" type="button" id="delete">delete</button>
          <button onclick="location.href='/app/quantityTypes/edit/${quantityType.id}'" type="button">edit</button>
        </div>

      </td>
    </tr>

  </c:forEach>

</table>
</body>
</html>
