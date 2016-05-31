<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/31/2016
  Time: 05:51
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
                <h4><small>MY PROFILE</small></h4>
                <hr>

                <div>
                    <img src="<c:url value="${userData.photo}"/>" class="img-circle" height="170" width="170" alt="Avatar">
                    <h2>${userData.firstName} ${userData.lastName}</h2>
                </div>
                <jsp:include page="questionary.jsp"/>

                <div class="form-group">
                    <label for="sel1">Sex:</label>
                    <select class="form-control" id="sel1">
                        <option>male</option>
                        <option>female</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="sel1">Birthday year:</label>
                    <select class="form-control" id="sel2">
                        <option>1994</option>
                        <option>1993</option>
                    </select>
                </div>

                <button type="button" class="btn btn-success">Save</button>
            </div>
        </div>
    </div>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
    <jsp:include page="login.jsp"/>
</sec:authorize>
</body>
</html>
