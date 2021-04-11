<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>Catalogue</h1>
   <label>Choisissez votre genre :</label>
   <select name="categorie">
   <option>JAZZ</option>
   <option>EDM</option>
   <option>K-POP</option> 
   </select>
  
 <table border="1" cellpadding="5">
      <tr>
                <th>Codearticle</th>
                <th>Title</th>
                <th>auteur</th>
                <th>Prix</th>
                 <c:forEach var="article" items="$listArticlesServlet}">
                <tr>
                    <td><c:out value="${article.codearticle}" /></td>
                    <td><c:out value="${article.title}" /></td>
                    <td><c:out value="${article.auteur}" /></td>
                    <td><c:out value="${article.prix}" /></td>
                </tr>
            </c:forEach>
 </table>

</body>
</html>