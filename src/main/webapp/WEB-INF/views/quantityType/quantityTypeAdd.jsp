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
<jsp:include page="../bar/utilbar.jsp"/>
<table>
  <form:form method="post" modelAttribute="quantityType">
    <form:hidden path="id"/>

    <tr>
      <th>Name</th>
      <td><form:input path="name"/><br>
        <form:errors path="name" cssClass="error-class"/></td>
    </tr>
    <tr>
      <th></th>
      <td><input type="submit" value="submit"></td>
    </tr>
  </form:form>
</table>

</body>
</html>
