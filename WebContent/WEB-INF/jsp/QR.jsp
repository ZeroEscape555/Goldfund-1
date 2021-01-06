<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<%@ include file="bt.jsp"%>
</head>
<body>
	<!--  页面总容器 -->
	<div class="container">
		<!--  导航栏 -->
		<%@ include file="nav.jsp"%>
		<div class="row" style="margin-top: 10px">
			<!--  左边栏 -->
			<%@ include file="ls.jsp"%>

			<div class="col-md">
				<div class="card">
					<div class="card-header">二维码生成</div>
					<form action="QRpost" method="post">
						<div class="form-group">
							<label for="username">转换内容</label> <input type="text"
								class="form-control" name="content" id="content"
								placeholder="二维码转换内容" required="required">
						</div>
						<div class="form-group">
							<label for="username">二维码宽</label> <input type="text"
								class="form-control" name="width" id="width" placeholder="二维码宽度"
								required="required">
						</div>
						<div class="form-group">
							<label for="username">二维码高</label> <input type="text"
								class="form-control" name="height" id="height"
								placeholder="二维码高度" required="required">
						</div>
						<button type="submit" class="btn btn-primary">提交</button>
					</form>
				</div>
			</div>
			<!--  右边栏 -->
			<%@ include file="rg.jsp"%>
		</div>


	</div>

</body>
</html>