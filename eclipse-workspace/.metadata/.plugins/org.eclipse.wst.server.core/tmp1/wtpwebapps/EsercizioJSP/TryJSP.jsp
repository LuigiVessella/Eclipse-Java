<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP per tec web</title>
</head>
<body>

<%! private int accessCount = 0;
	Date data = new Date();
%>


<%= "welcome user" %>

<p> Current time: <%= java.util.Calendar.getInstance().getTime()%>

<form method ="GET">
	<input type = "text" name = "nome" value = "<%= request.getParameter("nome") %> ">
	<input type ="submit" value = "put">
</form>


<%
	int accessCount2 = 0;
	accessCount2++;
	accessCount++;
	out.println("<br>la data di creazione della jsp: " + data.toLocaleString()); 
	out.println("<br>accessCount: " + accessCount);
	out.println("<br>accessCount2: " + accessCount2 + "<br>");

%>
<%= "Welcome " + request.getParameter("nome") %> 
</body>
</html>