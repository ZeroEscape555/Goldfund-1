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
						<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s" style="width:400px;">
							<h2 style="color:#f23;">${info}</h2>
							<h3>没有账号？</h3>
							<p>通过创建一个帐户与我们的基金定购系统关联，您将能够结帐更快，存储多个基金到账户，查看和跟踪您的持有基金。</p>
							<a class="acount-btn" href="/Goldfund/Reg">注册</a>
						</div>
						<div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s"
							style="float:right;width:400px;background-color: rgba(0,0,0,0.5);padding:30px;border-radius:20px;">
							<h3>登录</h3>
							<p>亲爱的用户您好，请您登录系统！<span>${info}</span></p>
							<form action="LoginAction" method="post">
								<div>
									<span>账号</span>
									<input type="text" name="username" placeholder="请输入账户名">
								</div>
								<div>
									<span>密码</span>
									<input type="password" name="password" placeholder="请输入密码">
								</div>
								<div class="form-group row">
									<label for="inputjagecode3" class="col-sm-1 col-form-label">验证码</label>
									<img name="Rimg" src="ResImage" onclick="renovate(this)">
									<script language="javascript">
										function renovate(img) {
											img.src = img.src + "?" + Math.random(); // 传入参数时，可以不定义参数名称

										}
									</script>
									<div class="col-sm">
										<input name="vcode" type="text" class="form-control" id="inputjagecode3"
											placeholder="Jagecode">
									</div>
								</div>
								<div></div>
								<input type="submit" value="Sing in" name="password">
								<a class="forgot" href="#">忘记密码？</a>
							</form>
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