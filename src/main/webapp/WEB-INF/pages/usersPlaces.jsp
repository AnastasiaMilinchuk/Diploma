<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/31/2016
  Time: 03:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
    <title></title>
    <jsp:include page="navigationElements/styles.jsp"/>
</head>

<body>
<sec:authorize access="isAuthenticated()">
    <jsp:include page="navigationElements/upperPanel.jsp"/>

    <div class="container-fluid">
        <div class="row content">
            <jsp:include page="navigationElements/leftPanel.jsp" />
            <div class="col-sm-9 section">
                <h4><small>MY PLACES</small></h4>
                <hr>
                <div id="map"></div>
                <script>
                    function initMap() {

                        var mapDiv = document.getElementById('map');
                        var map = new google.maps.Map(mapDiv, {
                            center: {lat: 48.225, lng: 31.105},
                            zoom: 6
                        });
                        <c:forEach var="place" items="${places}">
                            var myLatLng = {lat: ${place.lat}, lng: ${place.lng}};
                            var marker = new google.maps.Marker({
                                position: myLatLng,
                                map: map,
                                title: 'Hello World!'
                            });
                        </c:forEach>
                    }
                </script>
                <script src="https://maps.googleapis.com/maps/api/js?callback=initMap"
                        async defer></script>
            </div>
        </div>
    </div>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <jsp:include page="login.jsp"/>
</sec:authorize>
</body>
</html>