<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<meta http-equiv="x-ua-compatible" content="ie=edge">
		<title>BM</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<!-- Favicons -->
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
		<link rel="apple-touch-icon" href="${pageContext.request.contextPath}/resources/images/icon.png">
		
		<!-- Google font (font-family: 'Roboto', sans-serif; Poppins ; Satisfy) -->
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet"> 
		<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,600,600i,700,700i,800" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet"> 
		
		<!-- Stylesheets -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/plugins.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
		
		<!-- Cusom css -->
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">
		
		<!-- Modernizer js -->
		<script src="${pageContext.request.contextPath}/resources/js/vendor/modernizr-3.5.0.min.js"></script>
	</head>
	<body>
		<tiles:insertAttribute name="header"/>
		
		<tiles:insertAttribute name="body"/>
		
		<tiles:insertAttribute name="footer"/>
	</body>
</html>