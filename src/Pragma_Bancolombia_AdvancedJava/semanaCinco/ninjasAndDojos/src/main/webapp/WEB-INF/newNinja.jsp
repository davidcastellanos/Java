<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Ninja</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="col-6">
        <h2>Nuevo Ninja</h2>
        <form:form action="/ninjas/new" method="post" modelAttribute="nuevoNinja">

            <div class="form-group">
                <form:label path="dojo">Dojo</form:label>
                <form:select path="dojo" class="form-select">
                    <c:forEach items="${dojosDisponibles}" var="dojoDisp">
                        <option value="${dojoDisp.getId()}">${dojoDisp.getName()}</option>
                    </c:forEach>
                </form:select>
                <form:errors path="dojo" class="text-danger" />
            </div>

            <div class="form-group">
                <form:label path="firstName">Nombre:</form:label>
                <form:input path="firstName" class="form-control" />
                <form:errors path="firstName" class="text-danger" />
            </div>

            <div class="form-group">
                <form:label path="lastName">Apellido:</form:label>
                <form:input path="lastName" class="form-control" />
                <form:errors path="lastName" class="text-danger" />
            </div>

            <div class="form-group">
                <form:label path="age">Edad:</form:label>
                <form:input path="age" type="number" min="0" max="100" step="1" value="1" class="form-control"/>
                <form:errors path="age" class="text-danger" />
            </div>

            <br>
            <input type="submit" value="Crear" class="btn btn-success" />
        </form:form>

    </div>

</div>

</body>
</html>