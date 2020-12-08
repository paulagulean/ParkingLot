<%-- 
    Document   : login
    Created on : Nov 29, 2020, 2:49:46 PM
    Author     : GI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pageTemplate pageTitle="Login">

    <form class="form-singin"  method="POST" action="j_security_check">
        <h1 class="h3 mb-3 front-weight-normal"> Sing in </h1>      
        <label for="username" class="sr-only"> Username </label>
        <input type="text"  id="username" name="j_username" class="form-control" placeholder="Username" required autofocus/>
        <label for="password" class="sr-only"> Password </label>
        <input type="password"  id="password" name="j_password" class="form-control" placeholder="Password" required />
        <button class="btn btn-primary btn-lg btn-block" type="submit">Sign in </button>
    </form>    

</t:pageTemplate>
