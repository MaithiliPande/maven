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
      <h1 class="mt-5">Doctor's Appointment Management</h1>
      <p class="lead">This is spring application where technologies used are</p>
     <ul>
     	<li>Java SE</li>
     	<li>Java EE</li>
     	<li>Spring IOC</li>
     	<li>Spring MVC</li>
     	<li>Spring JDBC</li>
     	<li>Spring Security</li>
     	<li>MySQL</li>
     	<li>Bootstrap, HTML, CSS</li>
     </ul>
     

    </main>

	<%@ include file="common/footer.jsp" %>
	</div>
</body>
</html>