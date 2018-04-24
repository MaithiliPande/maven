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

      <h1 class="mt-5">Sign In</h1>
      <form action="./processLogin.htm" method="post">
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="loginName">Username</label>
	      <input type="text" class="form-control" name="loginName" placeholder="Username">
	    </div>
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="password">Password</label>
	      <input type="text" class="form-control" name="password" placeholder="Password">
	    </div>
	  </div>
	  
	  <input type="submit" class="btn btn-primary" value="Sign In" />
</form>

	<%@ include file="common/footer.jsp" %>
	</div>
</body>
</html>