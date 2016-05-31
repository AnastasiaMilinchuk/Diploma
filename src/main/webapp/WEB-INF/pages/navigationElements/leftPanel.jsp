<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/19/2016
  Time: 01:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<sec:authorize access="isAuthenticated()">
    <div class="col-sm-3 sidenav leftnav">
        <ul class="nav nav-pills nav-stacked">
            <li><a href="/diploma1/profile">Profile</a></li>
            <li><a href="/diploma1/myPosts">My Posts</a></li>
            <li><a href="/diploma1/myPlaces">My Places</a></li>
            <li><a href="/diploma1/favorites">Favorites</a></li>
        </ul><br>
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search Blog..">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">
                  <span class="glyphicon glyphicon-search"></span>
              </button>
            </span>
        </div>
    </div>
</sec:authorize>