<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ONLINE BANKING SYSTEM</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<style>
.container {
    max-width: 500px;
    margin: 0 auto;
    padding: 20px;
}

.form-control-lg {
    margin-bottom: 10px;
}

.btn-block {
    margin-top: 20px;
}
body {
    background-image: url("https://img.freepik.com/free-photo/vintage-camera-pencil-open-laptop-twig-isolated-white-background_23-2147979091.jpg");
    background-repeat: no-repeat;
    background-size: cover;
}

</style>
</head>
<body>
<div class="Booking-system">
    <div class="container">
        <form name="form" method="post" action="/addpayee">
            <div class="form-group">
                <label for="payeeid">Payee ID</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="6" size="6" pattern=".{6}"  id="payeeid" name="payeeid" required>
            </div>

            <div class="form-group">
                <label for="name">Customer Name</label>
                <input type="text" class="form-control form-control-lg" id="name" name="name" required>
            </div>

            <div class="form-group">
                <label for="mobileno">Account No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="12" size="12" pattern=".{12}" title="Account should contains 12 digits" id="accno" name="accno" required>
            </div>

            <div class="form-group">
                <label for="address">IFSC</label>
                <input type="text" class="form-control form-control-lg" id="ifsc" name="ifsc" required>
            </div>

            <div class="form-group">
                <label for="mobno">Mobile No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="10" size="10" pattern=".{10}" id="mobno" name="mobno" required>
            </div>

            <button type="submit" class="btn btn-dark btn-block mt-3">Add</button>
                         <a href="/home" class="btn btn-dark btn-block mt-3">Back</a>
            
        </form>
    </div>
</div>
</body>
</html>


