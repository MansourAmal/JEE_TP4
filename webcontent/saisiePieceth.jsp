<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Saisie des Pièces de Théâtre</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@ include file="header.jsp" %>
<p></p>
<div class="container">
    <div class="card">
        <div class="card-header">
            Saisie des Pièces de Théâtre
        </div>
        <div class="card-body">
            <form action="save.do" method="post">
                <div class="form-group">
                    <label class="control-label">Nom Pièce de Théâtre :</label>
                    <input type="text" name="nomPieceTheatre" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="control-label">Auteur :</label>
                    <input type="text" name="auteur" class="form-control"/>
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">Ajouter</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
