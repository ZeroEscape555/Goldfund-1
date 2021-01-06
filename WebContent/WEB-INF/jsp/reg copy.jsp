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
					<div class="card-header">用户注册</div>
					<div class="card-body">
						<!-- 注册表单 -->
						<p class="card-text">
						<form action="RegAction" method="post">
							<div class="form-group">
								<label for="username">用户名</label> <input type="text"
									class="form-control" name="name" id="name"
									placeholder="Username" required="required">
							</div>
							<div class="form-group">
								<label for="password">密码</label> <input type="password"
									class="form-control" name="password" id="password"
									placeholder="Password">
							</div>
							<div class="form-group">
								<label for="username">出生日期</label> 
								<input type="text"
									class="form-control" name="birth" id="birth"
									placeholder="YYYY-MM-DD" required="required">
							</div>
							<label>性别</label>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="sex"
									id="male" value="男" checked> <label
									class="form-check-label" for="male">男 </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="sex"
									id="female" value="女"> <label class="form-check-label"
									for="female">女</label>
							</div>
							<br> <label>特长</label>
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="Python"
									name="hobby" id="Python"> <label
									class="form-check-label" for="Python">Python</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="C++"
									name="hobby" id="C++"> <label class="form-check-label"
									for="C++">C++</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="Java"
									name="hobby" id="Java"> <label class="form-check-label"
									for="Java">Java</label>
							</div>
							<br>
							<div class="form-group">
								<label for="major">专业</label> <select id="major"
									class="form-control" name="major">
									<option value="软件工程" selected>软件工程</option>
									<option value="信息管理与信息系统">信息管理与信息系统</option>
									<option value="计算机">计算机</option>
									<option value="电子商务">电子商务</option>
								</select>
							</div>
							<button type="submit" class="btn btn-primary">注册</button>
						</form>
						</p>

					</div>
				</div>
			</div>
			<!--  右边栏 -->
		<%@ include file="rg.jsp"%>
		</div>
		

	</div>

</body>
</html>