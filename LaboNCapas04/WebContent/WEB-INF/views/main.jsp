<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LNCAPAS04</title>
</head>
<body>
	<!--<h1>${message}</h1>-->
	<h2>Informacion de Producto</h2>
	<form:form action = "${pageContext.request.contextPath}/formData" method="POST" modelAttribute ="product">
		
		<label>Nombre: </label><form:input type = "text" name = "name" path = "name"/>
		<form:errors path = "name" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Marca: </label><form:input type = "text" name = "brand" path = "brand"/>
		<form:errors path = "brand" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Descripci&oacute;n: </label><form:input type = "text" name = "description" path = "description"/>
		<form:errors path = "description" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Categoria: </label><form:input type = "text" name = "category" path = "category"/>
		<form:errors path = "category" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Precio: </label><form:input type = "number" step = ".01" name = "price" path = "price"/>
		<form:errors path = "price" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Fecha de Expiraci&oacute;n: </label><form:input type = "text" name = "price" path = "exp_date"/>
		<form:errors path = "exp_date" cssStyle = "color:#E81505"></form:errors><br>
		
		<input type = "submit" value = "Insertar"/>
	</form:form>
	</body>
</html>