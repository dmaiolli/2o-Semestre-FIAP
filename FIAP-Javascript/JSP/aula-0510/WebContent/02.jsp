<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usando JSP 02</title>
</head>
<body>
	<h1> Usando JSP </h1>
	<ul>
		<%
			for(int i = 0; i <= 10; i++){
				
			
		%>
		<li>
		<%
			out.print(i);
		%>
		</li>
		<%
			}
		%>
	</ul>
	
	<h3> Fez a contagem e usou o li dentro de um for </h3>
</body>
</html>