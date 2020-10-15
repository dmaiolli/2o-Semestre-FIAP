<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usando ArrayList</title>
</head>
<body>
	<h1>Usando ArrayList</h1>
	<%
		ArrayList<String> pessoas = new ArrayList<>();
	pessoas.add("Eu");
	pessoas.add("Tu");
	pessoas.add("Ele");
	pessoas.add("Nós");
	pessoas.add("Vós");
	pessoas.add("Eles");

	//exibindo
	out.print(pessoas);
	%>

	<p>
		<%
			out.print("Quantidade de pessoas: " + pessoas.size());
		%>
	</p>
	
	<ul>
	
		<%
			for (int i = 0; i < pessoas.size(); i++){
		%>
		
		<li>
			<%
				out.print(pessoas.get(i));
			%>
		</li>
		
		<%
			}
		%>
		
	</ul>

</body>
</html>