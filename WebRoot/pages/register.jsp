<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="注册">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="style/reset.css">
<link type="text/css" rel="stylesheet" href="style/main.css">

<script src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<!-- 加载插件  -->
<script src="js/formValidator-4.1.3.min.js" type="text/javascript"></script>
<!-- 加载扩展库(如果想用里面的函数、正则表达式，必须加载该文件)-->
<script src="js/formValidatorRegex.js" type="text/javascript"></script>

<title>注册中心</title>

</head>

<body>
	<div class='headerBar'>

		<div class="loginLogoBar">
			<div class="comWidth">
				<div class="loginLogo fl">
					<a href="#"><img src="images/1418827781_Shop-64.png"
						alt="Shop" /></a>
				</div>
				<div class="loginTitle fl">
					<p>欢迎注册</p>
				</div>
			</div>
		</div>
	</div>
	<div class="loginBox clearfix">
		<form id="regForm" action="register.do" method="post">
			<div class="loginText">
				<label for="username">邮箱/用户名/手机</label><br /> 
				<input id="username" name="username" type="text" />
				<span class="messageBox"></span>
				
				<label for="password">密码</label><br />
				<input id="password" name="password" type="password" /> 
				<span class="messageBox"></span>
				
				<label for="confirmPassword">确认密码</label><br/> 
				<input id="confirmPassword" name="confirmPassword" type="password" />
				<span class="messageBox"></span> 
				
				<label for="userEmail">验证邮箱</label><br /> 
				<input id="userEmail" name="userEmail" type="text" /> 
				<span class="messageBox"></span>
				
			</div>
			<div class="agreeBox">
				<input id="agree" class="agree" type="checkbox" name="autoLogin"
					value="同意" /> <label class="agree" for="agree">我已阅读并同意<a
					href="#">《用户注册协议》</a></label>
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
</body>
</html>
