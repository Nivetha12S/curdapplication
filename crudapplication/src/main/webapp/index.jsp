<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<section class="h-100 bg-dark">
  <div class="container">
    <div class="row d-flex justify-content-center align-items-center">
      <div class="col ">
        <div class="card card-registration ">
          <div class="row g-0">
            <div class="col-lg-6 d-none d-lg-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
		  	<div class="col-lg-6 bg-dark-subtle">
		  		<div class="card-body p-md-4 text-black">
		  		
		        	<form action="insert" method="post">
		            	<h3 class="mb-5 text-uppercase">Employee Registration form</h3>
						<div class="form-floating mb-5">
							  <input type="text" class="form-control" id="floatingInput" placeholder="name" name="name">
							  <label for="floatingInput">Name </label>
						</div>
						
						<div class="form-floating mb-5">
							  <input type="number" class="form-control" id="floatingPassword" placeholder="name" name="age">
							  <label for="floatingPassword">Age </label>
						</div>
						
						<div class="form-floating mb-5">
							  <input type="email" class="form-control" id="floatingInput" placeholder="name" name="email">
							  <label for="floatingInput">Email </label>
						</div>
							
						<div class="form-floating mb-5">
							  <input type="text" class="form-control" id="floatingPassword" placeholder="name" name="address">
							  <label for="floatingPassword">Address </label>
						</div>
							
				        <div class="d-flex justify-content-center pt-3">
				        	<a href="selectAll">
				            	<button type="submit" class="btn btn-outline-primary btn-lg">Store in Database</button>
				            </a>
				        </div>
				    </form>
				</div>
		        <div class="d-flex justify-content-center pt-2 pb-5">
					<a href="selectAll">
					<button type="submit" class="btn btn-outline-primary btn-lg">View All Data</button>
					</a>
				</div>
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
</style>
</body>
</html>