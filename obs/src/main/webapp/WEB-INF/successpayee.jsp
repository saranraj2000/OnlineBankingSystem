<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ONLINE BANKING SYSTEM</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    
    <!-- Custom Styles -->
    <style>
        body {
            background-image: url("https://img.freepik.com/free-photo/vintage-camera-pencil-open-laptop-twig-isolated-white-background_23-2147979091.jpg");
            background-repeat: no-repeat;
            background-size: cover;
            padding-top: 40px;
        }
        
        .container {
            max-width: 500px;
            margin: 0 auto;
            background-color: rgba(255, 255, 255, 0.9);
            border-radius: 5px;
            padding: 20px;
        }
        
        h6 {
            margin-bottom: 20px;
            text-align: center;
            color: #333;
        }
        
        .btn-block {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h6>Payee has been added..Please approve payee to transfer fund.</h6>
        <a href="viewpayee" class="btn btn-dark btn-block">View Payee/Approve Payee</a>
    </div>
</body>
</html>


