<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

<jsp:useBean id="auteur" class="com.octest.beans.Auteur" scope="request"/>
<jsp:setProperty name="auteur" property="prenom" value="ahmed" />
<jsp:setProperty name="auteur" property="nom" value="ben ahmed" />
<jsp:setProperty name="auteur" property="actif" value="true" />

<p> 
Nom: ${auteur.nom}<br>
Prénom: ${auteur.prenom}<br>
Actif: ${auteur.actif}<br>
</p>
</body>
</html>