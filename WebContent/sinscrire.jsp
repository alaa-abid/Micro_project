<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S'inscrire</title>
</head>
<body>
     <form action=" <%=request.getContextPath() %>/sinscrire"method="post">
     <h1>Inscrivez-vous!!!!!!!</h1></br>
      <label>Nom:</label>
      <input type="text" name="nom"  value="" maxlength="20"><br>     
      <label>Prenom:</label>
      <input type="text" name="prenom"  value="" maxlength="20"><br>
      <label>Email:</label>
      <input type="email" name="email" value="" maxlength="20"><br>
      <label>Adresse:</label>
      <input type="text" name="adresse"  value="" maxlength="20"><br>
      <label>Mot de passe:</label>
      <input type="password" name="motpasse"  value="" maxlength="20"><br>           
      <input type="submit" value="s'inscrire" >     
</form>
</body>
</html>