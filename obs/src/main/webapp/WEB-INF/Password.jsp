<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
<style type="text/css">
    /* Importing fonts from Google */
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');

    /* Resetting */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Poppins', sans-serif;
    }

    body {
        background: #ecf0f3;
    }

    .wrapper {
        max-width: 350px;
        min-height: 500px;
        margin: 80px auto;
        padding: 40px 30px 30px 30px;
        background-color: #ecf0f3;
        border-radius: 15px;
        box-shadow: 13px 13px 20px #cbced1, -13px -13px 20px #fff;
    }

    .logo {
        width: 80px;
        margin: auto;
    }

    .logo img {
        width: 100%;
        height: 80px;
        object-fit: cover;
        border-radius: 50%;
        box-shadow: 0px 0px 3px #5f5f5f,
        0px 0px 0px 5px #ecf0f3,
        8px 8px 15px #a7aaa7,
        -8px -8px 15px #fff;
    }

    .wrapper .name {
        font-weight: 600;
        font-size: 1.4rem;
        letter-spacing: 1.3px;
        padding-left: 10px;
        color: #555;
    }

    .wrapper .form-field input {
        width: 100%;
        display: block;
        border: none;
        outline: none;
        background: none;
        font-size: 1.2rem;
        color: #666;
        padding: 10px 15px 10px 10px;
    }

    .wrapper .form-field {
        padding-left: 10px;
        margin-bottom: 20px;
        border-radius: 20px;
        box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;
    }

    .wrapper .form-field .fas {
        color: #555;
    }

    .wrapper .btn {
        box-shadow: none;
        width: 100%;
        height: 40px;
        background-color: #03A9F4;
        color: #fff;
        border-radius: 25px;
        box-shadow: 3px 3px 3px #b1b1b1,
        -3px -3px 3px #fff;
        letter-spacing: 1.3px;
    }

    .wrapper .btn:hover {
        background-color: #039BE5;
    }

    .wrapper a {
        text-decoration: none;
        font-size: 0.8rem;
        color: #03A9F4;
    }

    .wrapper a:hover {
        color: #039BE5;
    }

    body {
        background-image: url("https://www.essentialcyprus.com/wp-content/uploads/2012/01/bank.jpg");
        background-repeat: no-repeat;
        background-size: 1500px 1000px
    }

    .wrapper {
        opacity: 90%;
    }

    @media(max-width: 380px) {
        .wrapper {
            margin: 30px 20px;
            padding: 40px 15px 15px 15px;
        }
    }
</style>
</head>

<body>
    <div class="wrapper">
        <div class="logo">
            <img src="https://www.essentialcyprus.com/wp-content/uploads/2012/01/bank.jpg" alt="">
        </div>
        <div class="text-center mt-4 name">
            Change Password
        </div>
        <center><h3>${msg}</h3></center>
        
        <form:form action="/changepassword" method="post" modelAttribute="cust">
            <form class="p-3 mt-3">
                <div class="form-field d-flex align-items-center">
                    <span class="fas fa-key"></span>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Current Password">
                </div>
                <div class="form-field d-flex align-items-center">
                    <span class="fas fa-key"></span>
                    <input type="password" class="form-control" name="newPassword" id="newPassword" placeholder="New Password">
                </div>
                <div class="form-field d-flex align-items-center">
                    <span class="fas fa-key"></span>
                    <input type="password" class="form-control"  name="confirmPassword" id="confirmPassword" placeholder="Confirm Password">
                </div>
                <button class="btn mt-3">Change Password</button>
                 <button class="btn mt-3" onclick="redirect()" type="button">Back</button>
                 <script>
                 function redirect(){
                	 window.location.href="/home";
                 }
                 </script>
                
            </form>
        </form:form>
        <div class="text-center fs-6">
        </div>
    </div>
</body>

</html>
