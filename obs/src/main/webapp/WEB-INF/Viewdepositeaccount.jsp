<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html></html>
<head>
<meta charset="UTF-8">
<title>Deposite Account</title>
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
        <a class="nav-link" href="/createaccount">Back</a>
      </li>
      
    </ul>
  </div>
  <div>
  
       <h5><a class="nav-link" href="/logout">Log Out</a>
       </h5> 
      
  </div>
</nav>

<c:choose>
        <c:when test="${mode=='ALLDEPO'}">
 		   <div class="container">
       <table class="table table-stripped table-hover table-condensed table-bodered">
       <thead>
       <tr>
       <th>Account No</th>
       <th> Branch</th>
       <th>IFSC</th>
       <th>Deposite Amount</th>
       <th>Tenure</th>
       <th>Mode Of Operation</th>
       <th>Rate Of Interest</th>
       <th>Maturity Date</th>
       </tr>
       </thead>
       <tbody>
        <c:forEach var="depo" items="${depolist}">
       <tr>
        <td>${depo.accno}</td>
        <td>${depo.branch}</td>
        <td>${depo.ifsc}</td>
        <td>${depo.depositeamount}</td>
        <td>${depo.tenure}</td>
        <td>${depo.modeofoperation}</td>
        <td>${depo.rateofinterest}</td>
        <td>${depo.maturitydate}</td>
        
        <td><a href="/deletedepo?accno=${depo.accno}">Close Account</a></td>
       </tr>
       </c:forEach>
       </tbody>
       </table>
    </div>
   </c:when>
    </c:choose>
</body>