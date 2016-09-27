<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <h1>用户登录</h1>
    <hr>
    <!-- 这是HTML注释 对客户端可见 -->
    <%-- 这是JSP注释 对客户端不可见 --%>
    <%
    //下方表单提交试用get方式，get方式会将表单信息以明文形式显示在地址栏中，而post不会。
     %>
    <form action="dologin.jsp" name="loginForm"method="get" >
    <table>
    	<tr>
    		<td>用户名：</td>
    		<td><input type="text"name="username"/></td>
    	</tr>
    	<tr>
    		<td>密码：</td>
    		<td><input type="password"name="password"/></td>
    	</tr>
    	<tr>
    		<td colspan="2"><input type="submit"value="登录"></td>
    	</tr>
    </table>
    </form>
  </body>
</html>
