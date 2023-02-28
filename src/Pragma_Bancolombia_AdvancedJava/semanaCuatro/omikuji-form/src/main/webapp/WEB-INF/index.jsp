<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <h1>Send an Omikuji</h1>

    <form action="/omikuji" method="POST">
        <div class="mb-3">
            <label>Number
                <input type="number"  min="5" max="25" name="numero">
            </label><br>

            <label>City</label>
            <input class="form-control" type="text" required name="ciudad" placeholder="Default input" aria-label="default input example">

            <label>Name</label>
            <input class="form-control" type="text" required name="nombre" placeholder="Default input" aria-label="default input example">

            <label>Activity</label>
            <input class="form-control" type="text" required name="actividad" placeholder="Default input" aria-label="default input example">

            <label>Animal</label>
            <input class="form-control" type="text" required name="animal" placeholder="Default input" aria-label="default input example">

            <label for="exampleFormControlTextarea1" class="form-label">Phrase</label>
            <textarea class="form-control" required name="frase" id="exampleFormControlTextarea1" rows="3"></textarea>
        </div>

        <button type="submit" name="enviar" class="btn btn-primary">Submit</button>
    </form>

    <div class="text-danger">
        <c:out value="${error}" />
    </div>

</body>
</html>