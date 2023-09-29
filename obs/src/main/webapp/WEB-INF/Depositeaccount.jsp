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
<c:if test="${not empty error}">

    <p class="errors" style="color: red;font-weight: bold;text-align: centre;margin-top: 10px;">${error}</p>

   </c:if>

<div class="Booking-system">
    <div class="container">
        <form name="form" method="post" action="/depositeaccount">
            <div class="form-group">
                <label for="accno">Account No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="12" value="${accno}" size="12" pattern=".{12}" title="Account should contains 12 digits" id="accno" name="accno" required>
            </div>

            <div class="form-group">
                <label for="branch">Branch</label>
                <input type="text" class="form-control form-control-lg" id="branch" name="branch" required>
            </div>

            <div class="form-group">
                <label for="ifsc">IFSC</label>
                <input type="text" class="form-control form-control-lg"  id="ifsc" name="ifsc" required>
            </div>

            <div class="form-group">
                <label for="depositeamount">Deposit Amount</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" id="depositeamount" name="depositeamount" required>
            </div>

            <div class="form-group">
                <label for="tenure">Tenure(in years)</label>
                <input type="text" class="form-control form-control-lg" id="tenure" name="tenure" required>
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
                <label for="rateofinterest">Rate Of Interest</label>
                <input type="text" class="form-control form-control-lg" id="rateofinterest" name="rateofinterest" required>
            </div>
                  <div class="form-group">
                <label for="rateofinterest">Maturity date</label>
                <input type="date" class="form-control form-control-lg" id="maturitydate" name="maturitydate" required>
            </div>
                      
            
            <button type="submit" class="btn btn-dark btn-block mt-3">Create Account</button>
             <a href="/createaccount" class="btn btn-dark btn-block mt-3">Back</a>
            
        </form>
    </div>
</div>
</body>
</html>






