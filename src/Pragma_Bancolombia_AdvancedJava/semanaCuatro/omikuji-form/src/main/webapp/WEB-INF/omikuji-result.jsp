<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Omikuji Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
    <div class="card-header">Omikuji</div>
    <div class="card-body">
        <h5 class="card-title">Here's your Omikuji</h5>
        <p class="card-text">In <c:out value="${num}"/> years, you will
        live in <c:out value="${ciudad}"/> with
            <c:out value="${nombre}"/> as your
        roommate, <c:out value="${actividad}"/> for a living.
        The next time you
        see a <c:out value="${animal}"/>, you will
        have good luck.
        Also, <c:out value="${frase}"/> </p>
    </div>
</div>

</body>
</html>