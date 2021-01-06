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
						<div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s"
							style="float:left;width:600px;background-color: rgba(0,0,0,0.5);padding:30px;border-radius:20px;">
							<h3>注册</h3>
							<p>欢迎注册<span>${info}</span></p>
							<form action="RegAction" method="post">
								<div>
									<span>账号</span>
									<input type="text" name="username" placeholder="请输入账户名">
								</div>
								<div>
									<span>密码</span>
									<input type="password" name="password" placeholder="请输入密码">
								</div>
								<div>
									<span>性别</span>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="sex" id="male" value="男"
											checked>
										<span style="color:aliceblue; float:left" class="form-check-label" for="male">男
										</span>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="sex" id="female" value="女">
										<span style="color:aliceblue; float:left" class="form-check-label"
											for="female">女</span>
									</div>
								</div>
								<div>
									<span>地址</span>
									<input type="text" name="address" placeholder="请输入地址">
								</div>
								<div>
									<span>电话</span>
									<input type="text" name="phonenumber" placeholder="请输入联系电话">
								</div>
								<div>
									<span>邮箱</span>
									<input type="email" name="email" placeholder="请输入联系邮箱">
								</div>
								<input type="submit" value="注册" name="password">
							</form>
						</div>
						<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s" style="width:400px;">
							<div class="caption">
								<h3>免责声明</h3>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi
									porta gravida
									at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>

							</div>
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