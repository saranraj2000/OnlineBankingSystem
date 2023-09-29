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
        <form name="form" method="post" action="/fund_transfer">
            <div class="form-group">
                <label for="accno">Account No</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" maxlength="12" size="12" pattern=".{12}" title="Account should contains 12 digits" id="accno" name="accno" required>
            </div>

            <div class="form-group">
                <label for="branch">Amount</label>
                <input type="text" class="form-control form-control-lg" onkeypress="return (event.charCode !=8 && event.charCode ==0 || (event.charCode >= 48 && event.charCode <= 57))" id="amount" name="amount" required>
            </div>

                        <button type="submit" class="btn btn-dark btn-block mt-3">Transfer Amount</button>
                                     <a href="/home" class="btn btn-dark btn-block mt-3">Back</a>
                        
        </form>
    </div>
</div>
</body>
</html>













<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
        <form name="form" method="post" action="/fund_transfer">
            <div class="form-group">
                <label for="accno">Account No</label>
                <input type="number" class="form-control form-control-lg" id="accno" name="accno" required>
            </div>
            <div class="form-group">
                <label for="amount">Amount</label>
                <input type="number" class="form-control form-control-lg" id="amount" name="amount" required>
            </div>        
            <button type="submit" class="btn btn-dark btn-block mt-3">Transfer Amount</button>
        </form>
    </div>
</div>
</body>
</html>



















 --%>