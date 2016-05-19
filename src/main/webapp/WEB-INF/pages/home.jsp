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
            <h4><small>RECENT POSTS</small></h4>
            <hr>
            <c:forEach var="num" items="${posts}">
                <h2><a href="/diploma1/article/${num.id}"><h2>${num.title}</h2></a></h2>
                <h5><span class="glyphicon glyphicon-time"></span> Post by <a href="#">${num.author}</a>, ${num.createDate},
                    <span class="glyphicon glyphicon-thumbs-up"></span> ${num.likes}
                </h5>
                <c:forEach var="tag" items="${num.tags}">
                    <h5><span class="label label-success">${tag}</span></h5><br>
                </c:forEach>
                <p>${num.smallText}</p>
                <a href="/diploma1/article/${num.id}"><button type="button" class="btn btn-default">Читати повністю</button></a>
                <br><br>
            </c:forEach>

            <%--<h4>Leave a Comment:</h4>--%>
            <%--<form role="form">--%>
                <%--<div class="form-group">--%>
                    <%--<textarea class="form-control" rows="3" required></textarea>--%>
                <%--</div>--%>
                <%--<button type="submit" class="btn btn-success">Submit</button>--%>
            <%--</form>--%>
            <%--<br><br>--%>

            <%--<p><span class="badge">2</span> Comments:</p><br>--%>

            <%--<div class="row">--%>
                <%--<div class="col-sm-2 text-center">--%>
                    <%--<img src="bandmember.jpg" class="img-circle" height="65" width="65" alt="Avatar">--%>
                <%--</div>--%>
                <%--<div class="col-sm-10">--%>
                    <%--<h4>Anja <small>Sep 29, 2015, 9:12 PM</small></h4>--%>
                    <%--<p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>--%>
                    <%--<br>--%>
                <%--</div>--%>
                <%--<div class="col-sm-2 text-center">--%>
                    <%--<img src="bird.jpg" class="img-circle" height="65" width="65" alt="Avatar">--%>
                <%--</div>--%>
                <%--<div class="col-sm-10">--%>
                    <%--<h4>John Row <small>Sep 25, 2015, 8:25 PM</small></h4>--%>
                    <%--<p>I am so happy for you man! Finally. I am looking forward to read about your trendy life. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>--%>
                    <%--<br>--%>
                    <%--<p><span class="badge">1</span> Comment:</p><br>--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-sm-2 text-center">--%>
                            <%--<img src="bird.jpg" class="img-circle" height="65" width="65" alt="Avatar">--%>
                        <%--</div>--%>
                        <%--<div class="col-xs-10">--%>
                            <%--<h4>Nested Bro <small>Sep 25, 2015, 8:28 PM</small></h4>--%>
                            <%--<p>Me too! WOW!</p>--%>
                            <%--<br>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        </div>
    </div>
</div>

<footer class="container-fluid">
    <p>Footer Text</p>
</footer>

</body>
</html>

    <%--<div class="container">--%>
            <%--<h1>Posts</h1>--%>
            <%--<ul class="pagination">--%>
                <%--<li><a href="#">1</a></li>--%>
                <%--<li><a href="#">2</a></li>--%>
                <%--<li><a href="#">3</a></li>--%>
                <%--<li><a href="#">4</a></li>--%>
                <%--<li><a href="#">5</a></li>--%>
            <%--</ul>--%>
            <%--<c:forEach var="num" items="${posts}">--%>
                <%--<div class="jumbotron">--%>
                    <%--<h5><span class="glyphicon glyphicon-pencil"></span> <small>${num.createDate}</small></h5>--%>
                    <%--<a href="/post?id=${num.id}"><h2>${num.title}</h2></a>--%>
                    <%--<h5><span class="glyphicon glyphicon-user"></span>  <a href="#"><small>${num.author}</small></a></h5>--%>

                            <%--<a href="#">--%>
                                <%--<span class="glyphicon glyphicon-thumbs-up"></span>--%>
                            <%--</a>--%>
                            <%--<label>${num.likes}</label>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>

    <%--</div>--%>

<%--</body>--%>
<%--</html>--%>