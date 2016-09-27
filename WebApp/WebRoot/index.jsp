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
    <h1>This is my JSP page!</h1>
    <hr>
    <!-- 这是HTML注释 对客户端可见 -->
    <%-- 这是JSP注释 对客户端不可见 --%>
    <%
    //这是单行注释 对客户端不可见
     %>
    <%!
    	String s = "a";
    	int add(int x,int y)
    	{
    		return x*y;
    	}
    %>
    
    <%
    	out.println("hello world!");
    	out.println(s);
    	out.println(add(3,4));
    %>
  </body>
</html>
