<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S'identifier</title>
</head>
<body>
  <form action="<%=request.getContextPath() %>/sidentifier" method="post">
    <label>Email</label>
    <input type="email" name="email" value=""  ><br>    
    <label>Mot de passe</label>
    <input type="password" name="motpasse" value="" ><br>    
    <input type="submit" value="S'identifier" >        
  </form>
</body>
</html>