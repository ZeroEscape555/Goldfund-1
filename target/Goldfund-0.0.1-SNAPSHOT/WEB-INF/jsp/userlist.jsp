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
					<div class="card-header">用户列表</div>
					<div class="card-body">

						<table class="table">
							<thead>
								<tr>
									<th scope="col">序号</th>
									<th scope="col">姓名</th>
									<th scope="col">性别</th>
									<th scope="col">专业</th>
									<th scope="col">动作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${users}" var="item">
									<tr <c:if test="${item.sex=='F'}">style="color:red</c:if>>
										<th scope="row">${item.id}</th>
										<td>${item.username}</td>
										<td>${item.sex}</td>
										<td>${item.major}</td>
										<td>
											<a href = "UserDetil?id=${item.id}" type="button" class="btn btn-light">详情</a>
											<a href = "UserUpdata?id=${item.id}" type="button" class="btn btn-light">修改信息</a>
											<a href = "UserDetil?id=${item.id}" type="button" class="btn btn-light">修改密码</a>
										</td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>


	</div>

</body>
</html>