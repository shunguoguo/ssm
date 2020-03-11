<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
<c:set var="baseUri" value="${pageContext.request.contextPath }"
	scope="request"></c:set>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>图书管理系统</title>
<!--  
<link rel="stylesheet" href="${baseUri}/static/layui/css/layui.css">
-->
</head>
<body>
	<c:forEach items="${UserList}" var="user">
								<tr>
									<td>${user.id}</td>
									<td>${user.name}</td>
									<td>${user.age}</td>
	</c:forEach>