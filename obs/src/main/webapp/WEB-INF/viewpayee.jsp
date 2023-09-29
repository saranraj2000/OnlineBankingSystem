<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payee details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<style>
body{


background-image: url("https://www.chetu.com/img/banking/mobile-banking/sliderbg/mobile-banking-banner.jpg");
  background: url(https://www.chetu.com/img/banking/mobile-banking/sliderbg/mobile-banking-banner.jpg);
  background-repeat: no-repeat;
  background-size: 1500px 1000px;
}
</style>


</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Home <span class="sr-only"></span></a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="/viewpayee">View Payee</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link" href="/home">Back</a>
      </li>
      
    </ul>
  </div>
  <div>
  
       <h5><a class="nav-link" href="/logout">Log Out</a>
       </h5> 
      
  </div>
</nav>

<c:choose>
       <c:when test="${mode=='ALLPAYEE'}">
    <div class="container">
       <table class="table table-stripped table-hover table-condensed table-bodered">
       <thead>
       <tr>
       <th>Payee ID</th>
       <th> Account No</th>
       <th>Name</th>
       <th>IFSC</th>
       <th>Mobile No</th>
       <th>SetStatus</th>
       </tr>
       </thead>
       <tbody>
        <c:forEach var="payee" items="${payeelist}">
       <tr>
        <td>${payee.payeeid}</td>
        <td>${payee.accno}</td>
        <td>${payee.name}</td>
        <td>${payee.ifsc}</td>
        <td>${payee.mobno}</td>
        <td>${payee.setstatus}</td>
        <td><a href="/deletepayee?payeeid=${payee.payeeid}">Delete</a></td>
        <td><a href="/approve?payeeid=${payee.payeeid}">Approve</a></td>
       </tr>
       </c:forEach>
       </tbody>
       </table>
    </div>
   </c:when>
    </c:choose>
</body>