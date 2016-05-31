<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/23/2016
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
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
    <sec:authorize access="isAuthenticated()">
            <div class="col-sm-9 section">
                <h4><small>CREATE POST</small></h4>
                <hr>
                <div class="form-group">
                    <label>Title:</label>
                    <input type="text" class="form-control" id="title">
                </div>
            </div>
    </sec:authorize>

    <sec:authorize access="!isAuthenticated()">
        <jsp:include page="login.jsp"/>
    </sec:authorize>
        </div>
    </div>
</body>
</html>
