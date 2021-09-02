<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: orange;">
<h1>This is my 1st Jsp Program</h1>
<h2>JSP is dynamic compilation just refresh the browser</h2>
<% out.print("Hello");
int a = 10;
int b = 20;
int c = a+b;
out.print("<br>Result is :");
for(int i =0;i<5;i++)
{
	out.print("<br> The value of i is "+i);
}
%>
<hr>
<form action="login.jsp">
UserName : <input type="text" name="username"><br><br>
Password : <input type="text" name="pass"><br><br>
<input type="submit" value="LOGIN">
</form>
</body>
</html>