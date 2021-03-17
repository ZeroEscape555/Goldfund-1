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
	<div class="container" style="background-image:url(/p_180110910701/images/dt_background.jpg);">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!-- register -->
			<div class="login-page" style="background-color:rgba(0,0,0,0.5)">
				<div class="container">
					<div class="account_grid">
						<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s" style="width:770px;">
							<h3 style="margin-bottom: 12px; margin-top: 12px">
								<a style="font-size: 2.8em;color:white;" class="acount-btn"
									href="#">${foods.foodname}</a>
							</h3>
							<form method="post" action="${pageContext.request.contextPath}/admin/FoodsUpdateAction">
								<p style="font-size: 1.8em;color:white;">名称：</p>
								<input type="hidden" name="foodid" value="${foods.foodid }">
								<input type="text" name="foodname" class="form-control" id="inputEmail3"
									placeholder="输入名称" value="${foods.foodname }" required>

								<p style="font-size: 1.8em;color:white;">单位净值：</p>
								<input type="number" name="foodprice" class="form-control"
									placeholder="${foods.foodprice}" value="${foods.foodprice }" step="0.1" min="0.1">

								<p style="font-size: 1.8em;color:white;">所属：</p>
								<input type="text" name="foodkind" class="form-control" id="inputEmail3"
									placeholder="输入名称" value="${foods.foodkind}" required>

								<p style="font-size: 1.8em;color:white;">近期涨幅：</p>
								<div class="col-sm-9">
									<textarea class="form-control" id="exampleFormControlTextarea1" name="foodds"
										rows="3">${foods.foodds }
										</textarea>
								</div>
								<div class="form-group row">
									<div class="col-sm-9">
										<button type="submit" class="acount-btn">确定修改</button>
									</div>
								</div>

							</form>
						</div>
						<div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s"
							style="float:right;width:400px;background-color: rgba(0,0,0,0.5);padding:30px;border-radius:20px;">
							<img class="card-img-top" src="${pageContext.request.contextPath}/food/${foods.imgp}"
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