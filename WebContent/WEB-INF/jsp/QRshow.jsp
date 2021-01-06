<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>饿了嚒</title>
	<%@ include file="bt.jsp"%>
</head>

<body>

	<!--  页面总容器 -->
	<div class="container" style="background-image:url(/Goldfund/images/dt_background.jpg);">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!-- register -->
			<div class="login-page" style="background-color:rgba(0,0,0,0.5)">
				<div class="container">
					<div class="account_grid">
						<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s" style="width:400px;">
							<h2 style="color:#f23;">${info}</h2>
							<h3>请扫码付款！</h3>
							<p>支付宝,全球领先的独立第三方支付平台</p>
							<a class="acount-btn" href="${pageContext.request.contextPath}/Index">返回</a>
						</div>
						<div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s"
							style="float:right;width:400px;background-color: rgba(0,0,0,0.5);padding:30px;border-radius:20px;">

							<img style="opacity: 0.85"src="photo/${photo}">
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

