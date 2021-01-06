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
			<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="/Goldfund/images/bt1.png" class="d-block w-100" alt="...">
					</div>
					<div class="carousel-item">
						<img src="/Goldfund/images/bt2.png" class="d-block w-100" alt="...">
					</div>
					<div class="carousel-item">
						<img src="/Goldfund/images/bt3.png" class="d-block w-100" alt="...">
					</div>
					<div class="carousel-item">
						<img src="/Goldfund/images/bt3.png" class="d-block w-100" alt="...">
					</div>
				</div>
			</div>
			<div class="latis">
				<div class="container">
					<div class="card">
						<h5 class="card-header">
							<font size='8px' color='#fE9076' style="float: 'center'">基金</font>
						</h5>

						<div class="card-body">
							<div class="card-deck">
								<c:forEach items="${foodsList}" var="foods">
									<div class="col-sm-4">
										<div class="card">
											<img class="card-img-top"
												src="${pageContext.request.contextPath}/food/${foods.imgp}"
												alt="Card image cap">
											<div class="card-body">
												<a
													href="${pageContext.request.contextPath}/foodsDetails?foodsId=${foods.foodid}">${foods.foodname}</a>

											</div>
											<div class="card-footer">
												<p style="color:red;margin-bottom:2px;">单位净值价格：￥${foods.foodprice}</p>
												<p style="color:blue;margin-bottom:2px;">所属：${foods.foodkind}</p>
											</div>
										</div>
									</div>

								</c:forEach>
							</div>
						</div>
					</div>
					<div class="clearfix">
						<nav aria-label="Page navigation example">
							<ul class="pagination">
								<li class="page-item"><a class="page-link"
										href="${pageContext.request.contextPath}/FoodList?pageNo=${page.first}&key=${page.queryKey}">首页</a>
								</li>
								<li class="page-item"><a class="page-link"
										href="${pageContext.request.contextPath}/FoodList?pageNo=${page.prev}&key=${page.queryKey}">上一页</a>
								</li>
								<li class="page-item"><a class="page-link"
										href="${pageContext.request.contextPath}/FoodList?pageNo=${page.next}&key=${page.queryKey}">下一页</a>
								</li>
								<li class="page-item"><a class="page-link"
										href="${pageContext.request.contextPath}/FoodList?pageNo=${page.last}&key=${page.queryKey}">尾页
									</a></li>
							</ul>
						</nav>
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