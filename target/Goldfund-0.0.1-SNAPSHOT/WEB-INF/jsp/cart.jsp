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
						<form method="post" action="${pageContext.request.contextPath}/Pay">

							<h1 class="text-center" style="margin-bottom: 30px">我的账户</h1>


							<div class="list-groupy" style="text-align:center;">
								<p style="color: blue">${info}</p>
								<table class="table">
									<div style="opacity: 0.7;" class="col-sm-12 thumbnail">
										
										<div class="col-sm-2 line-center">logo</div>
										<div class="col-sm-2 line-center">基金</div>
										<div class="col-sm-2 line-center">单位净值 </div>
										<div class="col-sm-2 line-center">数量</div>
										<div class="col-sm-2 line-center">操作</div>
									</div>
									<!-- <tr>
											<th scope="col">
												<div class="form-group form-check">
													<input type="checkbox" class="form-check-input" id="allcheck"
														onclick="swap()"><label>全选</label>
												</div>
											</th>
											<th scope="col">商品图片</th>
											<th scope="col">名称</th>
											<th scope="col">价格</th>
											<th scope="col">数量</th>
											<th scope="col">操作</th>
										</tr> -->
									<tbody>
										<c:forEach items="${items}" var="item">
											<div class="col-sm-12  list-group-item" style="opacity: 0.7;">
											
												<div class="col-sm-2 line-center">
													<img src="${pageContext.request.contextPath}/food/${item.imgp}"
														style="width:100px;height:100px">
												</div>
												<div class="col-sm-2 line-center">
													<a class="acount-btn" style="color: black;"
														href="${pageContext.request.contextPath}/foodsDetails?foodsId=${item.foodid}">${item.foodname}</a>
												</div>
												<div class="col-sm-2 line-center">
													${item.foodprice}
												</div>
												<div class="col-sm-2 line-center">
													<button type="button" class="btn btn-default min">
														<a class="acount-btn" style="color: black"
															href="${pageContext.request.contextPath}/user/AddItemCart?foodsId=${item.foodid}&num=-1">-</a>
													</button>
													<input id="${item.foodid}" type="text" class="small num"
														value="${item.foodnum}" />
													<button type="button" class="btn btn-default add">
														<a class="acount-btn" style="color: black"
															href="${pageContext.request.contextPath}/user/AddItemCart?foodsId=${item.foodid}&num=1">+</a>
													</button>
												</div>
												<!-- <div class="col-sm-2 line-center">小计</div> -->
												<div class="col-sm-2 line-center"><a class="acount-btn"
														style="color: black"
														href="${pageContext.request.contextPath}/user/DeleteItem?foodsId=${item.foodid}">删除</a>
												</div>
											</div>

										</c:forEach>
										<div class="col-sm-offset-7 col-sm-5" style="padding: 30px;">
											<a class="acount-btn" style="color: black"
												href="${pageContext.request.contextPath}/FoodList">继续浏览</a>
											<button type="submit" class="acount-btn">
												<font color='blACK'>支付</font>
											</button>
										</div>
									</tbody>
								</table>
							</div>
						</form>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
			<!-- footer-->
			<%@ include file="footer.jsp" %>
			<!-- footer-->
</body>
<script type="text/javascript">

	//jQuery
	$(function () {
		$(".add").click(function () {
			val = $(".num").val()
			if (val >= 0) {
			}
		});

	});
	$(function () {
		$(".min").click(function () {
			val = $(".num").val()
			if (val > 0) {
			}
		});

	});


</script>

</html>

<!--  右边栏 -->
<!-- <%@ include file="rg.jsp"%> -->
</div>
</div>

</body>

</html>