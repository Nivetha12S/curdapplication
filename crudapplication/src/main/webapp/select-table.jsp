<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*" %>
  <%@ page import = "PojoEmployee.EmployeePojo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<% List<EmployeePojo> userList= (List<EmployeePojo>)request.getAttribute("listUser"); %>
<div class="row m-2">
	<h3>Employee Data</h3>
	<div class="container">
		<form action="selectAll" method="get">
			<table class="table table-dark">
			  <thead>
			    <tr>
			      <th scope="col">Id</th>
			      <th scope="col">Name</th>
			      <th scope="col">Age</th>
			      <th scope="col">Email</th>
			      <th scope="col">Address</th>
			      <th scope="col">Update/Delete</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<% for(EmployeePojo ep:userList) { %>
			    <tr>
			      <td><%= ep.getId() %></td>
			      <td><%= ep.getName() %></td>
			      <td><%= ep.getAge() %></td>
			      <td><%= ep.getEmail() %></td>
			      <td><%= ep.getAddress() %></td>
			      <td><a href="selectPartData?id=<%= ep.getId() %>"><button type="button">Update</button></a>
			      <a href="delete?id=<%= ep.getId() %>"><button type="button">Delete</button></a></td>
			    </tr>
				<%}%>
			  </tbody>
			</table>
		</form>
	</div>
</div>
</body>
</html>