<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a = 10;
int b = 6;
int add(int a ,int b)
{
	return a+b;
}


%>


<% 
String user =request.getParameter("username");
String pass =request.getParameter("pass");
out.println("Username : "+user+" Password : "+pass);

out.print("Value of a = "+a);
out.println(add(2,4)+"<br><br>");

%>
<%= b %>
<%= a %>
<%= a+" "+b %>
<%= add(4,5) %>
<%= "Result of add :" +add(4,5) +" value of a is " + a + " value of b is : "+b  %>
</body>
</html>