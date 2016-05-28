<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
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
                    <h5><span class="label label-success">${tag}</span></h5>
                </c:forEach>

                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <c:set var="i" value="0" scope="page"/>
                        <c:forEach var="tag" items="${post.photos}">
                            <li data-target="#photos" data-slide-to="${i}"></li>
                            <c:set var="i" value="${i + 1}" scope="page"/>
                        </c:forEach>
                    </ol>

                    <!-- Wrapper for slides -->
                    <c:set var="i" value="0" scope="page"/>
                    <div class="carousel-inner" role="listbox">
                    <c:forEach var="photo" items="${post.photos}">
                        <c:choose>
                        <c:when test="${i == 0}">
                        <div class="item active">
                            <img src='<c:url value="${photo}"/>' >
                        </div>
                        </c:when>
                            <c:otherwise>
                                <div class="item">
                                    <img src='<c:url value="${photo}"/>' >
                                </div>
                            </c:otherwise>
                        </c:choose>
                        <c:set var="i" value="${i+1}" scope="page"/>
                    </c:forEach>
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
                <p>${post.text}</p>
                <br>

            <sec:authorize access="isAuthenticated()">
                    <form:form modelAttribute="post" action="/diploma1/article/${post.config_id}/like" method="POST" enctype="utf8">
                        <h4> Like:  <a href=""><button type="submit" class="glyphicon glyphicon-thumbs-up like-button"> </button></a> ${post.likes}</h4>
                    </form:form>
                <br>

                <div id="comments">
                <h4>Leave a Comment:</h4>
                <form:form action="/diploma1/article/${post.config_id}/comments" modelAttribute="comment" method="post" enctype="utf8">
                    <div class="form-group">
                        <form:textarea class="form-control" rows="3" path="text"/>
                        <form:errors cssClass=" alert-danger error" path="text" element="div" />
                    </div>
                    <button type="submit" class="btn btn-success">Submit</button>
                </form:form>
                <br><br>

                <p><span class="badge">${post.comments.size()}</span> Comments:</p><br>
                    <c:forEach var="comment" items="${post.comments}">
                        <div class="row">
                            <div class="col-sm-2 text-center">
                                <img src='<c:url value="${comment.authorPhotoUrl}"/>' class="img-circle" height="65" width="65" alt="Avatar">
                            </div>
                            <div class="col-sm-10">
                                <h5>${comment.author} <small>${comment.dateCreate}</small>
                                <c:choose>
                                    <c:when test="${post.commentAuthors.contains(user)}">
                                        <form:form modelAttribute="post" action="/diploma1/article/${post.config_id}/deleteComment/${comment.id}" method="POST" enctype="utf8">
                                           <a href=""> <button type="submit" class="glyphicon glyphicon-remove like-button"> </button> </a>
                                        </form:form>
                                    </c:when>
                                </c:choose>
                                </h5>

                                <p>${comment.text}</p>
                                <br>
                            </div>
                        </div>
                        <br>
                    </c:forEach>

                </div>
            </sec:authorize >

                <br><br>

        </div>
    </div>
</div>
</body>
</html>
