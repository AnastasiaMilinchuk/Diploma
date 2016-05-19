<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/19/2016
  Time: 02:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
    <title>Tags</title>
    <jsp:include page="navigationElements/styles.jsp"/>
</head>
<body>
<jsp:include page="navigationElements/upperPanel.jsp"/>

<div class="container-fluid">
    <div class="row content">
        <jsp:include page="navigationElements/leftPanel.jsp" />
        <div class="col-sm-9 section">
            <h2><small>TAGS</small></h2>
            <hr>
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search Tag..">
                <span class="input-group-btn">
                  <button class="btn btn-default" type="button">
                      <span class="glyphicon glyphicon-search"></span>
                  </button>
                </span>
            </div>
            <br>
            <c:forEach var="tag" items="${tags}">
                <h2><a href="/diploma1/tags/${tag.id}"><small>${tag.name}</small></a></h2>
                <h5><a href="#">${tag.postsQuantity}</a>  posts
                </h5>
                <br>
            </c:forEach>

            <ul class="pagination pagination-sm">
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
            </ul>
        </div>
    </div>
</div>

<footer class="container-fluid">
    <p>Footer Text</p>
</footer>
</body>
</html>
