<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="baseUri" value="${pageContext.request.contextPath }"
	scope="request"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>图书管理系统</title>
<link rel="stylesheet" href="${baseUri}/static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
	
		<!-- 引入头部导航 -->
		<c:import url="nav/titlenav.jsp"></c:import>

		<!-- 引入左边导航 -->
		<c:import url="nav/leftnav.jsp"></c:import>
		
		

		<div class="layui-body" style="background-color: orange">
			<!-- 内容主体区域 -->
			<div>
				
			</div>
		</div>


		<!-- 引入底部导航 -->
		<c:import url="nav/bottom.jsp"></c:import>
	</div>


	<script src="${baseUri}/static/layui/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
		layui.use('carousel', function() {
			var carousel = layui.carousel;
			//建造实例
			carousel.render({
				elem : '#test1',
				width : '100%' //设置容器宽度
				,
				arrow : 'always' //始终显示箭头
			//,anim: 'updown' //切换动画方式
			});
		});
	</script>
</body>
</html>