<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Student Data</title>
  </head>
  <body class="p-3 mb-2 bg-primary text-white">
    <h1>Student Data!</h1>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<form method="post" action="<c:url value="/addStudent/"/>">
  <div class="form-group">
    <label for="inputName">Name</label>
    <input type="text" class="form-control" name=name id="inputName" aria-describedby="emailHelp" placeholder="Enter Name">
   
  </div>
  <div class="form-group">
    <label for="inputAge">Age</label>
    <input type="number" class="form-control" name=age id="inputAge" placeholder="Age">
  </div>
   <div class="form-group">
    <label for="inputCity">City</label>
    <input type="text" class="form-control" name=city id="inputCity" placeholder="City">
  </div>
   <div class="form-group">
    <label for="inputEmail">Email</label>
    <input type="email" class="form-control" name=email id="inputEmail" placeholder="Email">
  </div>
  <button type="submit" class="btn btn-gradient-success">Submit</button>
</form>
<table class="table" class="table table-bordered">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">City</th>
      <th scope="col">Email</th>
       <th scope="col"></th>
        <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="stud" items="${studentList}">
    <tr>
      <td class="text-white">"${stud.name}"</td>
      <td class="text-white">"${stud.age}"</td>
      <td class="text-white">"${stud.city}"</td>
      <td class="text-white">"${stud.email}"</td>
      <td><div><button type="button" class="btn btn-success">Update</button></div></td>
      <td><div><button type="button" class="btn btn-danger">Delete</button></div></td>
    </tr>
    
    </c:forEach>
  </tbody>
 
</table>
  </body>
</html>