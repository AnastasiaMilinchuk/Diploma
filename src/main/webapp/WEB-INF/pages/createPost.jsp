<%--
  Created by IntelliJ IDEA.
  User: click
  Date: 5/23/2016
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<html>
<head>
    <title></title>
    <jsp:include page="navigationElements/styles.jsp"/>
    <link href="">
</head>
<body>
<script src="<c:url value="/resources/js/wysihtml5-0.3.0.js"/>" ></script>
<script src="<c:url value="/resources/js/jquery-1.7.2.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-wysihtml5.js"/>"></script>
<script src="<c:url value="/resources/editor/bootstrap-wysiwyg.js"/>"></script>

<script>
    $('.textarea').wysihtml5({
        "font-styles": true, //Font styling, e.g. h1, h2, etc. Default true
        "emphasis": true, //Italics, bold, etc. Default true
        "lists": true, //(Un)ordered lists, e.g. Bullets, Numbers. Default true
        "html": true, //Button which allows you to edit the generated HTML. Default false
        "link": true, //Button to insert a link. Default true
        "image": true, //Button to insert an image. Default true,
        "color": true //Button to change color of font
    });
    $('#editor').wysiwyg();
</script>

<div class="container">
    <div class="hero-unit" style="margin-top:40px">
        <textarea id="editor" class="textarea" placeholder="Enter text ..." style="width: 810px; height: 200px;"></textarea>
    </div>
</div>
</body>
</html>
