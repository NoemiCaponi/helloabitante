<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="it.helloabitante.model.Abitante"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci la modifica</title>
</head>
<body>
	<% Abitante abitanteSelezionato=(Abitante)request.getAttribute("abitanteAttributeModifica"); %>
	<form action="ModificaServlet" method="post">
		<label for="nomeInputId">NOME:</label><br> 
		<input type="text" name="nomeInput" id="nomeInputId" value="<%=abitanteSelezionato.getNome()%>"> <br> 
		<label for="cognomeInputId">COGNOME:</label><br> 
		<input type="text" name="cognomeInput" id="cognomeInputId" value="<%=abitanteSelezionato.getCognome()%>"> <br>
		<label for="codiceFiscaleInputId">Codice Fiscale:</label><br> 
		<input type="text" name="codiceFiscaleInput" id="codiceFiscaleInputId" value="<%=abitanteSelezionato.getCodiceFiscale()%>"> <br>
		<label for="etaInputId">Eta:</label><br> 
		<input type="text" name="etaInput" id="etaInputId" value="<%=abitanteSelezionato.getEta()%>"> <br>
		<label for="mottoInputId">Motto:</label><br> 
		<input type="text" name="mottoInput" id="mottoInputId" value="<%=abitanteSelezionato.getMottoDiVita()%>"> <br>
		<input type="hidden" name="abitanteId" value="<%=abitanteSelezionato.getIdAbitante()%>"><br>
		<br> 
		
		<input type="submit" value="MODIFICA">

	</form>

</body>
</html>