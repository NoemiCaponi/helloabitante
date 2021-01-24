<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi nuovo Abitante</title>
</head>
<body>
	<form action="AggiungiServlet" method="post">
		<label for="nomeInputId">NOME:</label><br> 
		<input type="text" name="nomeInput" id="nomeInputId" value=""> <br> 
		<label for="cognomeInputId">COGNOME:</label><br> 
		<input type="text" name="cognomeInput" id="cognomeInputId" value=""> <br>
		<label for="codiceFiscaleInputId">Codice Fiscale:</label><br> 
		<input type="text" name="codiceFiscaleInput" id="codiceFiscaleInputId" value=""> <br>
		<label for="etaInputId">Eta:</label><br> 
		<input type="text" name="etaInput" id="etaInputId" value=""> <br>
		<label for="mottoInputId">Motto:</label><br> 
		<input type="text" name="mottoInput" id="mottoInputId" value=""> <br>
		<input type="hidden" name="abitanteId" value=""><br>
		<br> 
		
		<input type="submit" value="AGGIUNGI">

	</form>

</body>
</html>