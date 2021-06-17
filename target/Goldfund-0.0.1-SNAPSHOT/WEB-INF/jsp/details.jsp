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
	<div class="container" style="background-image:url(/Goldfund/images/dt_background.jpg);">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!-- register -->
			<div class="login-page" style="background-color:rgba(0,0,0,0.5)">
				<div class="container">
					<div class="account_grid">
						<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s" style="width:400px;">
							<h3 style="margin-bottom: 12px; margin-top: 12px">
								<a style="font-size: 2.8em;color:white;"class="acount-btn" href="#">${foods.foodname}</a>
							</h3>
							<form method="post" action="${pageContext.request.contextPath}/user/AddItemCart">
								
								
								<p style="font-size: 1.8em;color:white;">${foods.foodds}</p>
								<p style="font-size: 1.2em;margin-top: 20px;">单位净值：<span style="font-size: 0.8em;margin-top: 20px;color:#f52"></span><span style="font-size: 2.2em;margin-top: 20px;color:#f32">${foods.foodprice}</span></p>
								<p style="font-size: 1.2em;">所属：${foods.foodkind}</p>
								<div class="form-group row">
									<label for="inputPassword3" class="col-sm-3 col-form-label"
										style="font-size: 1.2em;color:white;">数量：</label>
									<div class="col-sm-4 float-left">
										<input type="hidden" name="foodsId" value="${foods.foodid }">
										<input type="number" name="num" class="form-control"
											value="1" step="1" min="1" required>
									</div>
								</div>

								<div class="form-group row">
									<div class="col-sm-9">
										<button type="submit" class="acount-btn">加入账户</button>
									</div>
								</div>

							</form>
						</div>
						<div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s"
							style="float:right;width:400px;background-color: rgba(0,0,0,0.5);padding:30px;border-radius:20px;">
							<img class="card-img-top"
								src="${pageContext.request.contextPath}/food/${foods.imgp}"
								alt="Card image cap">
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