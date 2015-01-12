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

<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="style/reset.css">
<link type="text/css" rel="stylesheet" href="style/main.css">
<script src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/login.js"></script>

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
					<p>欢迎登录</p>
				</div>
			</div>
		</div>
	</div>
	<div class="loginBox clearfix">
		<form id="loginForm" action="login.do" method="post">
			<div class="loginText">
				<label for="username">邮箱/用户/已验证手机</label><br /> <input id="username"
					name="username" type="text" /> <label for="password">密码</label><br />
				<input id="password" name="password" type="password" />
			</div>
			<input id="autoLogin" class="loginCheck" type="checkbox"
				name="autoLogin" value="自动登录" /> <label class="loginCheck"
				for="autoLogin">自动登录</label> <input id="safeLogin"
				class="loginCheck" type="checkbox" name="safeLogin" value="安全控件登录" />
			<label class="loginCheck" for="safeLogin">安全控件登录</label> <a href="#">忘记密码?</a>
			<input type="submit" value="登录" />
			<p>使用合作网站账号登录：</p>
			<div class="linkBox">
				<a href="#">QQ</a><a href="#">网易</a><a href="#">人人</a><a href="#">奇虎360</a><a
					href="#">开心</a><a href="#">豆瓣</a><a href="#">搜狐</a> <a href="#"
					class="loginMore">更多</a>
			</div>
		</form>
		<div class="toReg">
			<p>快速注册&gt;&gt;</p>
		</div>
	</div>
</body>
</html>
