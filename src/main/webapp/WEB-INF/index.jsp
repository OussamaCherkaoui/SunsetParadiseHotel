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
    <div class="header">
        <h1 style="color:white">You welcome in your hotel</h1>
        <span id="nameHotel" >Sunset Paradise Hotel</span>
        <button id="discover">Discover</button>
    </div>
    <div class="container" id="container">
         <div class="roomAvailable">
        <div class="titleContainer"><h1>Liste des chambres disponibles</h1></div>

         <div class="search-container" id="search-container">
            <form methode="post" action="Home">
            <div class="search-group">
                <input type="date" id="dateSearch" name="dateSearch" placeholder="Sélectionnez une date">
               <button type="submit" id="searchdate">Rechercher</button>
            </div>
            </form>
            <form methode="post" action="Home">
            <div class="search-group">
               <input type="text" id="typeSearch" name="typeSearch" placeholder="Entrez un type de chambre">
               <button type="submit" id="searchtype">Rechercher</button>
           </div>
           </form>
           <form methode="post" action="Home">
           <div class="search-group">
              <input type="number" id="numberPerson" name="numberPerson" placeholder="Nombre de personnes">
              <button type="submit" id="searchnombrePersonnes">Rechercher</button>
           </div>
           </form>
        </div>
        
        <c:if test="${not empty listRoomDate}">
              <div class="cardsRoomDate" id="cardsRoomDate">
        <c:forEach var="room" items="${ listRoomDate }">
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
        </c:if>
        
        <c:if test="${not empty listRoomlistRoomType}">
              <div class="cardsRoomType" id="cardsRoomType">
        <c:forEach var="room" items="${ listRoomType }">
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
        </c:if>
        <c:if test="${not empty listRoomNombrePersons}">
              <div class="cardsRoomNumberPerson" id="cardsRoomNumberPerson">
        <c:forEach var="room" items="${ listRoomNombrePersons }">
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
        </c:if>
        <div class="cardsRoom" id="cardsRoom">
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
        <div id="cnsltReserveButton"><button id="btn-consultreserv">Consulter Reservation</button></div>
        <div class="reserveRoom" id="reserveRoom" style="display:none">
            <form method="post" action="Home">
                <label for="roomId">Numéro de la chambre:</label>
                <input type="hidden" id="roomId" name="roomId" value="123"> <!-- Remplacez "123" par l'ID de la chambre -->

               <label for="arrivalDate">Date d'arrivée:</label>
               <input type="date" id="arrivalDate" name="arrivalDate" required>

              <label for="departureDate">Date de départ:</label>
              <input type="date" id="departureDate" name="departureDate" required>

              <input type="submit" value="Réserver">
           </form>
       </div>
        </div>
        
        <div class="consultReservation" style="display:none">
        <div class="titleContainer"><h1>Liste des Reservation des chambres</h1></div>
        <div class="cardsReservation" id="card2">
        <c:forEach var="reservation" items="${ ListReservation }">
              <div class="card-reserve">
                   <div id="idReservation"><span style="font-weight:bold">numéro de reservation : </span>${ reservation.idReservation }</div>
                   <div id="type"><span style="font-weight:bold">Type du chambre : </span>${ reservation.type }</div>
                   <div id="prix"><span style="font-weight:bold">Prix : </span>${ reservation.prix }</div>
                   <div id="equipements"><span style="font-weight:bold">Equipements : </span>${ reservation.equipements }</div>
                   <div id="nombresPersonnes"><span style="font-weight:bold">Nombre des personnes : </span>${ reservation.nombresPersonnes }</div>
                   <div id="dateArrivee"><span style="font-weight:bold">Date d' arrivée : </span>${ reservation.dateArrivee }</div>
                   <div id="dateDepart"><span style="font-weight:bold">Date de depart : </span>${ reservation.dateDepart }</div>
              </div>
        </c:forEach>
        </div>
        <div id="cnsltchambre"><button id="btn-consultchambre">Consulter chambres disponible</button></div>
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
    <script>

const discoverLink = document.getElementById('discover');
const container = document.getElementById('container');

const RoomDisponible = document.querySelector('.roomAvailable');
const reservationConfirme = document.querySelector('.consultReservation');

discoverLink.addEventListener('click', ()=>{
	container.scrollIntoView({ behavior: 'smooth' }); 
  });
  
const consultReservation = document.getElementById('btn-consultreserv');
const consultchambre = document.getElementById('btn-consultchambre');

consultReservation.addEventListener('click', ()=>{
	RoomDisponible.style.display="none";
	reservationConfirme.style.display="flex";
  });
  
consultchambre.addEventListener('click', ()=>{
	RoomDisponible.style.display="flex";
	reservationConfirme.style.display="none"; 
  });
  
const searchtype = document.getElementById('searchtype');
const searchnombrePersonnes = document.getElementById('searchnombrePersonnes');
const searchdate = document.getElementById('searchdate');


const cardsRoomType = document.getElementById('cardsRoomType');
const cardsRoomNumberPerson = document.getElementById('cardsRoomNumberPerson');
const cardsRoom = document.getElementById('cardsRoom');
const cardsRoomDate = document.getElementById('cardsRoomDate');


searchtype.addEventListener('click',function(event){
	event.preventDefault();
	cardsRoomType.style.display="flex";
	cardsRoomNumberPerson.style.display="none";
	cardsRoom.style.display="none";
	cardsRoomDate.style.display="none";
  });
  
  
searchnombrePersonnes.addEventListener('click', function(event) {
	event.preventDefault();
	cardsRoomNumberPerson.style.display="flex";
	cardsRoomType.style.display="none";
	cardsRoom.style.display="none";
	cardsRoomDate.style.display="none";
  });
  
searchdate.addEventListener('click', function(event) {
	event.preventDefault();
	cardsRoomDate.style.display="flex";
	cardsRoomNumberPerson.style.display="none";
	cardsRoomType.style.display="none";
	cardsRoom.style.display="none";
  });
  

</script>
</body>
</html>