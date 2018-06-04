<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginPageController" method="post">
<table align="center" width="300px" style="background-color:#EDF6EA;border:1px solid #000000;">
<tr><td colspan=2 style="font-weight:bold;" align="center">login</td></tr>
<tr><td colspan=2 align="center" height="10px"></td></tr>
	<tr>
		<td style="font-weight:bold;">Username</td>
		<td><input type="text" name="username" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Password</td>
		<td><input type="password" name="password" value=""></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" name="Submit" value="login" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
	</tr>
	<tr><td colspan=2 align="center" height="10px"></td></tr>
</table>
</form> 
</body>
</html>

