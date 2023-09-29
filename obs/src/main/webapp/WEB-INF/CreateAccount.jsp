<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Banking System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style>
body {
    background-image: url("https://www.essentialcyprus.com/wp-content/uploads/2012/01/bank.jpg");
    background-repeat: no-repeat;
    background-size: 100% auto;
}

.card {
    margin: 20px;
    max-width: 450px;
    padding: 5px;
    background-color: #f8f9fa;
    border: none;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    opacity:85%;
}

.card-header {
    font-weight: bold;
    font-size: 24px;
    margin-bottom: 20px;
    text-align: center;
}

.card-body {
    padding: 0;
}

.navbar-brand {
    font-weight: bold;
    font-size: 24px;
}

.nav-link {
    color: #000;
}

.nav-link:hover {
    color: #007bff;
}

.nav-link.active {
    color: #007bff;
}
</style>
</head>
<body>
<div class="card">
    <div class="card-header">
        Online Banking System
    </div>
    <div class="card-body">
        <div class="card">
            <div class="card-body">
                <a class="nav-link active" href="/home">Home</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <a class="nav-link" href="/deposite_account">Fixed Deposit opening</a>
            </div>
        </div>
        
           <div class="card">
            <div class="card-body">
                <a class="nav-link" href="/recurring_account">Recurring Deposit Opening</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <a class="nav-link" href="viewdepositeaccount">View Fixed Deposit Account</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <a class="nav-link" href="/viewrecurringaccount">View Recurring Deposit Account</a>
            </div>
        </div>
    </div>
    
</div>
</body>
</html>



