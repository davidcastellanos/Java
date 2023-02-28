<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fruty Loops</title>
</head>
<body>
    <h1>Fruit Store</h1>
    <table class="table">
        <tbody>
        <tr>
            <th>NAME</th>
            <th>PRICE</th>
        </tr>

        <c:forEach items="${arrayFruits}" var="fruit">
            <tr>
                <td><c:out value="${fruit.getName()}"/></td>
                <td><c:out value="${fruit.getPrice()}"/></td>
            </tr>

        </c:forEach>
<%--<tr>
    <td> <c:out value="${arrayFruits.get(0).getName()}"/> </td>
    <td> <c:out value="${arrayFruits.get(0).getPrice()}"/></td>
</tr>--%>
        </tbody>
    </table>
</body>
</html>