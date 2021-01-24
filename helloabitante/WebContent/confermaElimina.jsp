<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="it.helloabitante.model.Abitante"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conferma Eliminazione</title>
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


<h3>Sei sicuro di volere eliminare l'abitante? </h3>

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
		
<% Abitante abitanteDaEliminare=(Abitante)request.getAttribute("abitanteAttributeElimina"); %>

<tr>
	  	 <td><%=abitanteDaEliminare.getIdAbitante()%></td>
	  	<td><%=abitanteDaEliminare.getNome() %></td>
	  	<td><%=abitanteDaEliminare.getCognome() %></td>
	  	<td><%=abitanteDaEliminare.getCodiceFiscale() %></td>
	  	<td><%=abitanteDaEliminare.getEta() %></td>
	  	<td><%=abitanteDaEliminare.getMottoDiVita() %></td>
		
	</tr>
	
	</table>
	
	<form action="EliminaServlet" method="post">
	<input type="hidden" value="<%=abitanteDaEliminare.getIdAbitante()%>" name="abitanteId">
	<input type="submit" value="CONFERMA ELIMINAZIONE">

</form>
</body>
</html>