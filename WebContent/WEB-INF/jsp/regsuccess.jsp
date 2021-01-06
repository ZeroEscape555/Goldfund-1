<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>金控基金</title>
	<%@ include file="bt.jsp"%>
</head>

<body>

	<!--  页面总容器 -->
	<div class="container" style="background-image:url(/Goldfund/images/login_background.jpg);">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!-- register -->
			<div class="login-page" style="background-color:rgba(0,0,0,0.5)">
				<div class="container">
					<div class="account_grid">
						<div style="color:aliceblue" class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s"
							style="width:400px;">
							<h1>注册成功！！！</h1>
							<ul>
								<li>用户名:${username}</li>
								<li>密码:${password}</li>
								<li>地址:${address}</li>
								<li>性别:${sex}</li>
								<li>邮箱:${email}</li>
								<li>电话:${phonenumber}</li>
								<li>注册时间:${time}</li>
							</ul>
							<span>马上登入</span>
							<a class="acount-btn" href="/Goldfund/Login">登入</a>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
			<!-- footer-->
			<%@ include file="footer.jsp" %>
			<!-- footer-->
</body>

</html>