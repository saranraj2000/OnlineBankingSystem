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
        <form name="form" method="post" action="/Registration">
            <div class="form-group">
                <label for="custid">Customer ID</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="6" size="6" pattern=".{6}" id="custid" name="custid" required>
            </div>

            <div class="form-group">
                <label for="accno">Account No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="12" size="12" pattern=".{12}" title="Account should contains 12 digits" id="accno" name="accno" required>
            </div>

            <div class="form-group">
                <label for="custname">Customer Name</label>
                <input type="text" class="form-control form-control-lg" id="custname" name="custname" required>
            </div>

            <div class="form-group">
                <label for="mobileno">Mobile No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="10" size="10" pattern=".{10}" id="mobileno" name="mobileno" required>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" class="form-control form-control-lg" id="address" name="address" required>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control form-control-lg" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" id="password" name="password" required>
            </div>
            <div id="message">
  <h3>Password must contain the following:</h3>
  <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
  <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
  <p id="number" class="invalid">A <b>number</b></p>
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>

            <button type="submit" class="btn btn-dark btn-block mt-3">Save</button>
                         <a href="/home" class="btn btn-dark btn-block mt-3">Back</a>
           
        </form>
    </div>
</div>
</body>
</html>






