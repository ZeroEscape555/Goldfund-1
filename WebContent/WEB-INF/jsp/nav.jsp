<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-sm ">
	<a class="navbar-brand" href="#"> <img src="/Goldfund/images/logo.png" class="img-fluid"
			href="/Goldfund/Index" alt="Responsive image">
	</a>

	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="/Goldfund/Index">金控基金</a></li>
			<c:if test="${username=='admin'}">
			<li class="nav-item"><a class="nav-link" href="/Goldfund/admin/FoodsAdmin">修改基金</a></li>
			<li class="nav-item"><a class="nav-link" href="/Goldfund/admin/FoodAdd">添加基金</a></li>
			<li class="nav-item"><a class="nav-link" href="/Goldfund/admin/UserList">用户管理</a></li>
			</c:if>
			<c:if test="${username!='admin'}">
		<li class="nav-item"><a class="nav-link" href="/Goldfund/Index">首页</a></li>
		<li class="nav-item"><a class="nav-link" href="/Goldfund/FoodList">基金</a></li>
		</c:if>
		<li class="nav-item"><a class="nav-link" href="#">友情链接</a></li>
		<li class="nav-item"></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				${username==null?"未登录":username} </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="/Goldfund/Login">登入</a>
				<a class="dropdown-item" href="/Goldfund/Reg">注册</a>
				<a class="dropdown-item" href="/Goldfund/Logout">注销</a>
			</div>
		</li>
		<!--<a class="navbar-brand" href="#">蔡李洪180110910701</a>
-->

	</ul>
		<c:if test="${username!='admin'}">
	<form class="form-inline my-5 mx-5 my-lg-0" action="FoodList" method="post">
		<input class="form-control mr-sm-2" type="search"
			placeholder="请输入你要查找的基金名称名" aria-label="Search" name="key"
			style="margin-top:30px;margin-bottom:30px;margin-left:25px;width:220px;">
		<button class="acount-btn" type="submit"><span style="color:black">查找一下</span></button>
	</form>
	<ul class="navbar-nav navbar-right hidden-sm">

		<li class="nav-item"><a class="nav-link" href="/Goldfund/kf">客服</a></li>

		<li class="nav-item"><a class="nav-link" href="#">个人中心</a></li>
		<li class="nav-item"><a class="nav-link" href="/Goldfund/user/MyCart">我的账户</a></li>
		<a class="navbar-brand" href="#"> <img src="/Goldfund/images/gwc.png" class="img-fluid"
				alt="Responsive image">
		</a>

	</ul>
	</c:if>
	<!-- <form method="post" action="UserSearch"
		class="form-inline my-2 my-lg-0">
		<input name="key" class="form-control mr-sm-2" type="search"
			placeholder="Search" aria-label="Search">
		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	</form> -->
</nav>