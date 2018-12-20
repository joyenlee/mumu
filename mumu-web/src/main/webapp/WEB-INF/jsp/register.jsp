<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head><title>Register</title></head>
<body>

<div id="global">
	<form action="register" method="post">
		<fieldset>
			<legend>注册</legend>
			<label for="name">用户名：</label>
			<input type="text" id="name" name="name" value="" tabindex="1"/>
			
			<label for="password">密码：</label>
			<input type="password" id="password" name="password"/>
			
			<label for="confirm_password">请再输入一次密码：</label>
			<input type="password" id="confirm_password" name="confirmPassword"/>
		</fieldset>
		
		<input type="submit" value="提交"/>
	</form>
</div>
</body>

</html>