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
							<div class="form-group">
								<label for="exampleInputPassword1">用户名</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									placeholder="${user.username}">
							</div>
							<div class="input-group mb-3">
								<label for="staticEmail" class="col-sm-2 col-form-label">专业</label>
								<select class="custom-select" id="inputGroupSelect01">
									<option selected>Choose...</option>
									<option value="computer" <c:if test="${user.major=='computer'}">selected</c:if>>computer</option>
									<option value="software">software</option>
									<option value="information">information</option>
									<option value="electronic">electronic</option>
								</select>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">性别</label> <input
									type="text" class="form-control" id="sex"
									placeholder="${user.sex}">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">出生年月</label> <input
									type="text" class="form-control" id="birth"
									placeholder="${user.birth}">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">特长</label> <input
									type="text" class="form-control" id="strong"
									placeholder="${user.strong}">
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