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
<% List<EmployeePojo> list= (List<EmployeePojo>)request.getAttribute("listUser"); %>

<section class="h-100 bg-dark">
  <div class="container">
    <div class="row d-flex justify-content-center align-items-center">
      <div class="col ">
        <div class="card card-registration ">
          <div class="row g-0">
            <div class="col-lg-6 d-none d-lg-block">
            	<img src="https://mdbootstrap.com/img/new/ecommerce/vertical/004.jpg" alt="Trendy Pants and Shoes"
          class="w-100 rounded-t-5 rounded-tr-lg-0 rounded-bl-lg-5" />
            </div>
		  	<div class="col-lg-6 bg-dark-subtle">
		  	
		  	
		  	<form action="update" method="post">
		  		<div class="card-body p-md-4 text-black">
		        	
		            	<h3 class="mb-5 text-uppercase">Employee Update form</h3>
						
						<div class="form-floating mb-5">
							  <input type="number" class="form-control" id="floatingInput" placeholder="name" name="id" value="<%= list.get(0).getId() %>">
							  <label for="floatingInput">Id</label>
						</div>
							
						<div class="form-floating mb-5">
							  <input type="text" class="form-control" id="floatingPassword" placeholder="name" name="name" value="<%= list.get(0).getName() %>">
							  <label for="floatingPassword">Name</label>
						</div>
						
						<div class="form-floating mb-5">
							  <input type="number" class="form-control" id="floatingPassword" placeholder="name" name="age" value="<%= list.get(0).getAge() %>">
							  <label for="floatingPassword">Age</label>
						</div>
						
						<div class="form-floating mb-5">
							  <input type="email" class="form-control" id="floatingPassword" placeholder="name" name="email" value="<%= list.get(0).getEmail() %>">
							  <label for="floatingPassword">Email</label>
						</div>
						
						<div class="form-floating mb-3">
							  <input type="text" class="form-control" id="floatingPassword" placeholder="name" name="address" value="<%= list.get(0).getAddress() %>">
							  <label for="floatingPassword">Address</label>
						</div>
							
				        <div class="d-flex justify-content-center">
				        	<button type="submit" class="btn btn-outline-primary btn-lg">Store Data</button>
				        </div>
				</div>
				</form>
			</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<style type="text/css">
body {
    overflow:hidden;
}
h3{
	text-align: center;
}
 </style>

</body>
</html>