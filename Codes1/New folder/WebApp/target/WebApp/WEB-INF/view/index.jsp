<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <form method="post" action="<c:url value="/addUser/"/>">
  <div class="form-group">
    <label for="inputName">Name</label>
    <input type="text" class="form-control" name="Name" id="inputName" aria-describedby="emailHelp" placeholder="Enter Name" value="${userUpdate.name}">
    
   <div class="form-group">
    <label for="inputCity">City</label>
    <input type="text" class="form-control"  name="city" id="inputCity" placeholder="Enter City name" value="${userUpdate.city}">
  </div>
   
  </div>
   <div class="form-group">
    <label for="inputEmail">Email Address</label>
    <input type="email" class="form-control"  name="email" id="inputEmail" aria-describedby="emailHelp" placeholder="Enter Email" value="${userUpdate.email}">
  </div>
 <c:if test="${empty userUpdate.email}">
  <button type="submit" class="btn btn-primary">Add User</button></c:if>
   <c:if test="${!empty userUpdate.email}">
  <button type="submit" class="btn btn-primary">Update User</button></c:if>
</form>


<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">City</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="${userList}">
    <tr>
      <th scope="row">"${user.name}"</th>
      <td>"${user.city}"</td>
      <td>"${user.email}"</td>
      <td><div class="btn-group" role="group" aria-label="Basic mixed styles example">
     <a href="<c:url value="/updUser/${user.email}"/>"> <button class="btn btn-success">Update</button></a>
    <a href="<c:url value="/deLUser/${user.email}"/>"> <button class="btn btn-danger">Delete</button></a> 
      </div>
      </td>
    </tr>
  </c:forEach>
  </table>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>