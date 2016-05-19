<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/18/2016
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Travel It</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="/diploma1/home">Home</a></li>
            <li><a href="/diploma1/articles">Articles</a></li>
            <li><a href="/diploma1/tags">Tags</a></li>
            <sec:authorize access="!isAuthenticated()">
                <li><a href="/diploma1/login">Login</a></li>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <li><a href="/diploma1/logout">Logout</a></li>
            </sec:authorize>

        </ul>
    </div>
</nav>