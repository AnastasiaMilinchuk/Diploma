<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/20/2016
  Time: 00:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<sec:authorize access="isAuthenticated()">
    <div class="btn-group btn-group-justified">
        <a href="#" class="btn btn-default">Recent</a>
        <a href="#" class="btn btn-default">MostPopular</a>
        <a href="#" class="btn btn-default">Recomended</a>
    </div>
    <br>
</sec:authorize>
