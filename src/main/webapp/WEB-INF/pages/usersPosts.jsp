<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/26/2016
  Time: 01:04
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
                <h4><small>MY POSTS</small></h4>
                <hr>
                <form method="get" action="createPost" enctype="utf8">
                    <button type="submit"  class="btn btn-danger">Add new post</button>
                </form>
                <br>
                <c:forEach var="num" items="${posts}">
                    <h2><a href="/diploma1/article/${num.config_id}"><h2>${num.title}</h2></a></h2>
                    <h5><span class="glyphicon glyphicon-time"></span> Post by <a href="#">${num.author}</a>, ${num.createDate},
                        <span class="glyphicon glyphicon-thumbs-up"></span> ${num.likes}
                    </h5>
                    <c:forEach var="tag" items="${num.tags}">
                        <h5><span class="label label-success">${tag}</span></h5>
                    </c:forEach>
                    <p>${num.smallText}</p>
                    <a href="/diploma1/article/${num.config_id}"><button type="button" class="btn btn-primary">Читати повністю</button></a>
                    <br><br>
                </c:forEach>
            </div>
        </div>
    </div>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <jsp:include page="login.jsp"/>
    </sec:authorize>
</body>
</html>
