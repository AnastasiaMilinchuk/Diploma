<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <jsp:include page="navigationElements/styles.jsp"/>
    <style>
        .authorization-section {
            width: 50%;
        }
    </style>
</head>

<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Travel It</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="home">Home</a></li>
            <li><a href="#">Articles</a></li>
            <li><a href="#">Places</a></li>
            <li><a href="login">Login</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="jumbotron authorization-section">
        <c:url value="/j_spring_security_check" var="loginUrl" />
        <form action="${loginUrl}" method="post">
            <h2 class="form-signin-heading">Please log in</h2>
            <br>
            <input type="text" class="form-control" name="j_username" placeholder="Email address" required autofocus >
            <br>
            <input type="password" class="form-control" name="j_password" placeholder="Password" required >
            <br>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
            <h5>Not register yet? <a href="signup">Sign Up!</a></h5>
        </form>
    </div>
</div>

</body>
</html>
