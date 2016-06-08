<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TravelIt</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="navigationElements/styles.jsp"/>

</head>
<body>


<jsp:include page="navigationElements/upperPanel.jsp"/>

<div class="container-fluid">
    <div class="row content">
    <jsp:include page="navigationElements/leftPanel.jsp" />
        <div class="col-sm-9 section">
            <jsp:include page="navigationElements/articlesPanel.jsp"/>
            <h4><small>${heading}</small></h4>
            <hr>
            <c:forEach var="num" items="${posts}">
                <h2><a href="/diploma1/article/${num.config_id}"><h2>${num.title}</h2></a></h2>
                <h5><span class="glyphicon glyphicon-time"></span> Post by <a href="#">${num.author}</a>, ${num.createDate},
                    <span class="glyphicon glyphicon-thumbs-up"></span> ${num.likes}
                </h5>
                <h5>
                    <c:forEach var="tag" items="${num.tags}">
                        <span class="label label-success">${tag}</span>
                    </c:forEach>
                </h5>
                <br>
                <p>${num.smallText}</p>
                <a href="/diploma1/article/${num.config_id}"><button type="button" class="btn btn-primary">Читати повністю</button></a>
                <br><br>
            </c:forEach>
        </div>
    </div>
</div>

<footer class="container-fluid">
    <p>Footer Text</p>
</footer>

</body>
</html>