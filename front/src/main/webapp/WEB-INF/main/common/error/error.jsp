<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Page Error</title>
	</head>
	<body>
		<div id="wrapper">
			<div id="page-wrapper">
				<div align="center">
					<c:out value="${msg}"/>
				</div>
			</div>
		</div>
	</body>
</html>