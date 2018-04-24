<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DAMS-APP Home Page</title>
<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="sticky_footer_navbar" value="/static/css/sticky-footer-navbar.css" />
<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${sticky_footer_navbar}" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container">
	<%@include file="common/header.jsp" %>

    <!-- Begin page content -->
    <main role="main" class="container">
      <h1 class="mt-5">User Registration</h1>
      <form action="./processRegistration.htm" method="post">
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="firstName">First Name</label>
	      <input type="text" class="form-control" name="firstName" placeholder="First Name">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="lastName">Last Name</label>
	      <input type="text" class="form-control" name="lastName" placeholder="Last Name">
	    </div>
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="contact">Contact</label>
	      <input type="text" class="form-control" name="contact" placeholder="Contact">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="email">Email</label>
	      <input type="email" class="form-control" name="email" placeholder="Email">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="address">Address</label>
	    <input type="text" class="form-control" name="address" placeholder="Address">
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="loginName">Login Name</label>
	      <input type="text" class="form-control" name="loginName" placeholder="Login Name">
	    </div>
	    <div class="form-group col-md-4">
	      <label for="password">Password</label>
	      <input type="password" class="form-control" name="password" placeholder="Password">
	    </div>
	  </div>
	  <input type="submit" class="btn btn-primary" value="Sign Up" />
</form>
     
    </main>

	<%@ include file="common/footer.jsp" %>
	</div>
</body>
</html>