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
							<h1 color="aliceblue">Login successfully!!</h1>
							<h2>欢迎${username}，祝你使用愉快！</h2>
							<span>现在开始订餐</span>
							<a class="acount-btn" href="/Goldfund/Index">首页</a>
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

<!--  右边栏 -->
<!-- <%@ include file="rg.jsp"%> -->
</div>
</div>

</body>

</html>