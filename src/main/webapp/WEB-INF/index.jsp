<%@ include file="taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="./style.css">
<style>
<%@ include file="style.css" %>
</style>
</head>
<body>
    <nav class="navbar">
        <ul>
            <li><a href="home">Home</a></li>
        </ul>
    </nav>
    
    <div class="container">
        <h1>Liste des chambres disponibles</h1>
        <%-- Exemple de r�cup�ration de donn�es depuis une base de donn�es pour afficher les chambres disponibles --%>
        <% 
            // Exemple de r�cup�ration de donn�es depuis une base de donn�es
            // Ici, nous simulons l'affichage de quelques chambres disponibles
            String[] chambres = {"Chambre simple", "Chambre double", "Suite junior", "Suite familiale"};
            for (String chambre : chambres) {
        %>
        <div class="chambre">
            <p><strong>Type de chambre:</strong> <%= chambre %></p>
            <!-- Autres d�tails de la chambre � afficher ici -->
        </div>
        <% } %>
    </div>
</body>
</html>