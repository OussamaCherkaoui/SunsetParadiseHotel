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
            <li><a href="./images" ></a></li>
            <li><a href="home">Home</a></li>
        </ul>
    </nav>
    <div class="header">
        <h1 style="color:white">You welcome in your hotel</h1>
        <span id="nameHotel" >Sunset Paradise Hotel</span>
        <button id="discover">Discover</button>
    </div>
    <div class="container">
        <h1>Liste des chambres disponibles</h1>
        <div class="cardsRoom">
        <c:forEach var="room" items="${ listRoomAvailable }">
              <div class="card">
                   <div id="idRoom"><span style="font-weight:bold">numéro du chambre : </span>${ room.idRoom }</div>
                   <div id="type"><span style="font-weight:bold">Type : </span>${ room.type }</div>
                   <div id="prix"><span style="font-weight:bold">Prix : </span>${ room.prix }</div>
                   <div id="equipements"><span style="font-weight:bold">Equipements : </span>${ room.equipements }</div>
                   <div id="nombresPersonnes"><span style="font-weight:bold">Nombre des personnes : </span>${ room.nombresPersonnes }</div>
                   <div><button id=btn-reserve>Reserve</button></div>
              </div>
        </c:forEach>
        </div>
    </div>
    <footer>
        <div class="container-Footer">
            <div class="footer-content">
                <div class="footer-section about">
                    <h2>A propos de nous</h2>
                    <p>Sunset Paradise Hotel est un lieu de détente ultime pour les voyageurs en quête d'une escapade tropicale. Situé au bord de la mer, notre hôtel offre des vues spectaculaires sur le coucher de soleil et des services de qualité supérieure pour rendre votre séjour inoubliable.</p>
                </div>
                <div class="footer-section links">
                    <h2>Liens rapides</h2>
                    <ul>
                        <li><a href="#">Accueil</a></li>
                        <li><a href="#">Chambres</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
                <div class="footer-section contact">
                    <h2>Nous contacter</h2>
                    <ul>
                        <li><span><i class="fas fa-map-marker-alt"></i></span>Club Omnisport BeniMellal</li>
                        <li><span><i class="fas fa-phone"></i></span>+334223567890</li>
                        <li><span><i class="fas fa-envelope"></i></span>Paradise@service.com</li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
</body>
</html>