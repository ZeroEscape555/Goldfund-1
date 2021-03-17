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
						<img src="/Goldfund/images/bt4.png" class="d-block w-100" alt="...">
					</div>
				</div>
			</div>
			<div class="latis">
				<div class="container">
					<div class="col-md-4 latis-left">
						<h3>诺安全球黄金(320013)</h3>
						<img src="/Goldfund/images/4.jpg" class="img-responsive" alt="">
						<div class="special-info grid_1 simpleCart_shelfItem">
							<p>近1年：14.67% 近1月：4.98% </p>
							<div class="cur">
								<div class="cur-left">
									<div class="item_add"><span class="item_price"><a class="morebtn hvr-rectangle-in"
												href="#">加入我的账户</a></span></div>
								</div>
								<div class="cur-right">
									<div class="item_add"><span class="item_price">
											<h6>1.1100</h6>
										</span></div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
					</div>
					<div class="col-md-4 latis-left">
						<h3>国泰黄金ETF联接A(000218)</h3>
						<img src="/Goldfund/images/1.jpg" class="img-responsive" alt="">
						<div class="special-info grid_1 simpleCart_shelfItem">
							<p>1年：14.58% 近1月：4.56% </p>
							<div class="cur">
								<div class="cur-left">
									<div class="item_add"><span class="item_price"><a class="morebtn hvr-rectangle-in"
												href="#">加入我的账户</a></span></div>
								</div>
								<div class="cur-right">
									<div class="item_add"><span class="item_price">
											<h6>1.4902</h6>
										</span></div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
					</div>
					<div class="col-md-4 latis-left">
						<h3>华安黄金易ETF联接C(000217)</h3>
						<img src="/Goldfund/images/3.jpg" class="img-responsive" alt="">
						<div class="special-info grid_1 simpleCart_shelfItem">
							<p>近1年：14.51% 近1月：4.54%</p>
							<div class="cur">
								<div class="cur-left">
									<div class="item_add"><span class="item_price"><a class="morebtn hvr-rectangle-in"
												href="#">加入我的账户</a></span></div>
								</div>
								<div class="cur-right">
									<div class="item_add"><span class="item_price">
											<h6>1.4460</h6>
										</span></div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>


				</div>
			</div>
			
			<!-- feature -->
			<!-- magnust -->
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