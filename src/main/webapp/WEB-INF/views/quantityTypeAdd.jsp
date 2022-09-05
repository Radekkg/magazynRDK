<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>

<%--<link rel="stylesheet" href="/css/style.css">--%>

<body>
<jsp:include page="navibar.jsp"/>
<form:form method="post" modelAttribute="quantityType">
  <form:hidden path="id"/>
  Name:
  <form:input path="name"/>
  <form:errors path="name" cssClass="error-class"/>


  <input type="submit" value="submit">

</form:form>
</body>
</html>
