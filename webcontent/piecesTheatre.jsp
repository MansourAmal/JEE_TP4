<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<p></p>
<div class="container">
<div class="card">
 <div class="card-header">
 Recherche des Piece de theatre
 </div>
 <div class="card-body">
 <form action="chercher.do" method="get">
 <label>Mot Clé</label>
 <input type="text" name="motCle" value="${model.motCle}" />
 <button type="submit" class="btn btn-primary">Chercher</button>
 </form> 
 <table class="table table-striped">
 <tr>
 <th>ID</th><th>Nom Piece</th><th>auteur</th>
 
 </tr>
 <c:forEach items="${model.piecesTheatre}" var="p">
 <tr>
 <td>${p.idPieceTheatre}</td>
 <td>${p.nomPieceTheatre }</td>
 <td>${p.auteur }</td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimer.do?id=${p.idProduit }">Supprimer</a></td>
 <td><a href="editer.do?id=${p.idProduit }">Edit</a></td>
 </tr>
 </c:forEach> 
 </table>
 </div>
</div>
</div>
</body>
</html>