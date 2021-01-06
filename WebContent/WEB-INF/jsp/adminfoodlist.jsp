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
	<div class="container">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!--  左边栏 -->
			<!-- <%@ include file="ls.jsp"%> -->
			<div class="latis">
				<div class="container">
					<div class="card" style="text-align:center;">
							<p>${info}</p>
						<table class="table" style="text-align:center;">
							<div style="opacity: 0.7;" class="col-sm-12 thumbnail">
								<div class="col-sm-1 line-center">id</div>
								<div class="col-sm-3 line-center">logo</div>
								<div class="col-sm-3 line-center">名称</div>
								<div class="col-sm-2 line-center">单位净值</div>
								<div class="col-sm-3 line-center">操作</div>
							</div>
							<tbody>
								<c:forEach items="${foodsList}" var="foods">
									<div class="col-sm-12  list-group-item" style="opacity: 0.7;">
										<div class="col-sm-1 line-center">
											${foods.foodid}
										</div>
										<div class="col-sm-3 line-center">
											<img src="${pageContext.request.contextPath}/food/${foods.imgp}"
												style="width:100px;height:100px">
										</div>
										<div class="col-sm-3 line-center">
											${foods.foodname}
										</div>
										<div class="col-sm-2 line-center">
											${foods.foodprice}
										</div>
										<div class="col-sm-3 line-center">
											<button type="button" class="btn btn-default min">
												<a class="acount-btn" style="color: black"
													href="${pageContext.request.contextPath}/admin/FoodsUpdate?foodsId=${foods.foodid}">修改</a>
											</button>

										</div>
									</div>

								</c:forEach>
							</tbody>
						</table>
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