<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>BM</title>
	</head>
	<body>
		<div class="header">
			<tiles:insertAttribute name="header"/>
		</div>
		
		<div class="nav">
			<tiles:insertAttribute name="nav"/>
		</div>
		
<!-- 		<div class="content"> -->
<%-- 			<tiles:insertAttribute name="body"/> --%>
<!-- 		</div> -->
		
		<div class="footer">
			<tiles:insertAttribute name="footer"/>
		</div>
	</body>
</html>