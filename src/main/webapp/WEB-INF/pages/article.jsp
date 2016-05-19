<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/17/2016
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <jsp:include page="navigationElements/styles.jsp"/>
</head>
<body>
<jsp:include page="navigationElements/upperPanel.jsp" />

<div class="container-fluid">
    <div class="row content">
        <jsp:include page="navigationElements/leftPanel.jsp" />
        <div class="col-sm-9 section">
                <h2>${post.title}</h2>

                <h5><span class="glyphicon glyphicon-time"></span> Post by <a href="#">${post.author}</a>, ${post.createDate},
                </h5>
                <c:forEach var="tag" items="${post.tags}">
                    <h5><span class="label label-success">${tag}</span></h5><br>
                </c:forEach>

                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                        <li data-target="#myCarousel" data-slide-to="3"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="http://demo.joomlashine.com/joomla-templates/jsn_artista/pro/images/sampledata/content/detail-image.jpg" alt="Chania">
                        </div>

                        <div class="item">
                            <img src="imgs/img.jpg" alt="Chania">
                        </div>

                        <div class="item">
                            <img src="imgs/img.jpg" alt="Flower">
                        </div>

                        <div class="item">
                            <img src="imgs/img.jpg" alt="Flower">
                        </div>
                    </div>

                    <!-- Left and right controls -->
                    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <br>
                <p>${post.smallText}</p>
                <br>
                <form:form modelAttribute="post" action="${post.id}" method="POST" enctype="utf8">
                    <h4> Like:  <a href=""><button type="submit" class="glyphicon glyphicon-thumbs-up like-button"> </button></a> ${post.likes}</h4>
                </form:form>
                <br><br>
        </div>
    </div>
</div>
</body>
</html>
