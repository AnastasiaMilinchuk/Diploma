<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sign Up</title>

    <jsp:include page="navigationElements/styles.jsp"/>
    <style>
        .authorization-section {
            width: 50%;
        }
        .error{
            margin-top: 5px;
            padding: 3px 3px 3px 8px;
        }
    </style>
</head>


<body>

<jsp:include page="navigationElements/upperPanel.jsp"/>
<div class="container">
    <div class="jumbotron authorization-section">
        <form:form modelAttribute="userData" method="POST" action="signup" enctype="utf8">
            <h2 class="form-signin-heading">Please sign up</h2>
            <form:input path="firstName" class="form-control"  placeholder="First Name" id = "firstName" autocomplete="off"/>
            <form:errors cssClass="alert-danger error" path="firstName" element="div"/>
            <br>
            <form:input path="lastName" class="form-control" placeholder="Last Name" id = "lastName" autocomplete="off"/>
            <form:errors cssClass=" alert-danger error" path="lastName" element="div" />
            <br>
            <form:input path="email" class="form-control" placeholder="E-mail" id="email" value="" autocomplete="off"/>
            <form:errors cssClass="alert-danger error" path="email" element="div" />
            <br>
            <%--<form:errors path="email" element="div" />--%>
            <form:input path="password" class="form-control" value="" placeholder="Password" id="password" type="password" autocomplete="off"/></td>
            <form:errors cssClass=" alert-danger error" path="password" element="div" />
            <br>
            <form:input path="matchingPassword" class="form-control" value="" id="submitPassword" placeholder="Re-enter passsword" type="password" autocomplete="off"/></td>
            <form:errors cssClass="alert-danger error" path="matchingPassword" element="div" />
            <form:errors cssClass="alert-danger error" element="div" />
            <br>
            <button type="submit" class="btn btn-lg btn-primary btn-block" id="submit" >Sign Up</button>
            <h5>Have an account? <a href="login">Log in!</a></h5>
        </form:form>

    </div>
</div>

</body>
</html>
