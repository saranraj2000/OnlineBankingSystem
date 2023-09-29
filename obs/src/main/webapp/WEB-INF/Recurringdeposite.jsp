<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

.textbox-style {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border-radius: 5px;
    border: 1px solid #ccc;
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
        <form name="form" method="post" action="/recurringaccount">
            <div class="form-group">
                <label for="accno">Account No</label>
                <input type="text" class="form-control form-control-lg textbox-style" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="12" value="${accno}" size="12" pattern=".{12}" title="Account should contains 12 digits" id="accno" name="accno" required>
            </div>
            
            <div class="form-group">
                <label for="branch">Name</label>
                <input type="text" class="form-control form-control-lg textbox-style" id="name" name="name" required>
            </div>
            

            <div class="form-group">
                <label for="branch">Branch</label>
                <input type="text" class="form-control form-control-lg textbox-style" id="branch" name="branch" required>
            </div>

            <div class="form-group">
                <label for="ifsc">IFSC</label>
                <input type="text" class="form-control form-control-lg textbox-style" id="ifsc" name="ifsc" required>
            </div>

            <div class="form-group">
                <label for="depositeamount">Instalment Amount</label>
                <input type="text" class="form-control form-control-lg textbox-style" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" title="Minimum 100 per month" id="instalmentamount" name="instalmentamount" required>
            </div>

            <div class="form-group">
                <label for="tenure">Tenure(in year)</label>
                <input type="text" class="form-control form-control-lg textbox-style" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" id="tenure" name="tenure" required>
            </div>
            <div class="form-group">
                <label for="modeofoperation">Mode Of Operation</label>
                <select id="modeofoperation" name="modeofoperation" class="form-control form-control-lg textbox-style" required>
                    <option value="">SELECT</option>
                    <option value="Single">Single</option>
                    <option value="Join">Join</option>                                             
                </select>
            </div>
            <div class="form-group">
                <label for="rateofinterest">Maturity date</label>
                <input type="date" class="form-control form-control-lg textbox-style" id="maturitydate" name="maturitydate" required>
            </div>
            
            <button type="submit" class="btn btn-dark btn-block mt-3">Create Account</button>
                         <a href="/createaccount" class="btn btn-dark btn-block mt-3">Back</a>
            
        </form>
    </div>
</div>
</body>
</html>

