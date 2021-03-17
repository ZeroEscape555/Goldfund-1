<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<%@ include file="ls.jsp"%>

			<div class="col-md">
				<div class="card">
					<div class="card-header">用户详情</div>
					<div class="card-body">
						<form>
						<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">用户id</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${user.id}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">用户名</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${user.username}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">性别</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${user.sex}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">出生年月</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${user.birth}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">特长</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${user.strong}">
								</div>
							</div>
						</form>

					</div>

				</div>
			</div>
		</div>
	</div>


	</div>

</body>
</html>