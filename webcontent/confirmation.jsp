<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Confirmation Ajout Pièce de Théâtre</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@ include file="header.jsp" %>
<p></p>
<div class="container">
    <div class="card">
        <div class="card-header">
            Confirmation Ajout Pièce de Théâtre
        </div>
        <div class="card-body">
            <div class="form-group">
                <label class="control-label">ID :</label>
                <input type="text" name="idPieceTheatre" class="form-control" value="${pieceTheatre.idPieceTheatre}"/>
            </div>
            <div class="form-group">
                <label class="control-label">Nom Pièce de Théâtre :</label>
                <input type="text" name="nomPieceTheatre" class="form-control" value="${pieceTheatre.nomPieceTheatre}"/>
            </div>
            <div class="form-group">
                <label class="control-label">Auteur :</label>
                <input type="text" name="auteur" class="form-control" value="${pieceTheatre.auteur}"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>
