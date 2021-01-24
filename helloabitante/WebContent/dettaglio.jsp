<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.helloabitante.model.Abitante"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Cognome</th>
				<th>Codice fiscale</th>
				<th>Eta'</th>
				<th>Motto di vita</th>
			</tr>
		</thead>
	<%
		Abitante abitantePassatoDaServlet = (Abitante) request.getAttribute("abitanteDettaglioAttributeName");
	%>
	<tr>
	  	 <td><%=abitantePassatoDaServlet.getIdAbitante()%></td>
	  	<td><%=abitantePassatoDaServlet.getNome() %></td>
	  	<td><%=abitantePassatoDaServlet.getCognome() %></td>
	  	<td><%=abitantePassatoDaServlet.getCodiceFiscale() %></td>
	  	<td><%=abitantePassatoDaServlet.getEta() %></td>
	  	<td><%=abitantePassatoDaServlet.getMottoDiVita() %></td>
		
	</tr>
	
	</table>
</body>
</html>