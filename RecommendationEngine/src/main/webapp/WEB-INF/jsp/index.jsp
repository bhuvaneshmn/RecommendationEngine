<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/css/style.css" rel="stylesheet" />
<title>Login here</title>
<style>
body{
background-image:url(resources/images/bg1.jpg);
background-repeat:repeat-right;}
</style>
</head>
    <body>
<div class="header">
<img src="<c:url value="/resources/images/222.png"/>" style="float:left;width:500px;height:75px;"/>
 </div>

        <div class="container">
            <div class="codrops-top">
      
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
<br>
</header>
            <section>				
                <div id="container_demo" style="position:absolute;left:35%;">
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    
                    <a class="hiddenanchor" id="login"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  id="loginForm" action="find-user" method="post" modelAttribute="userDTO" > 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname"  > Username </label>
                                    <input id="name" name="name" required="required" type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd"> Password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df90EO" /> 
                                </p>
                               
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									New user?
									<a href="login" class="to_register">Sign Up</a>
								</p>
                            </form>
                            <span class="errorMessage"><c:out value="${status}" /></span>
                        </div>
                        </div>
                        </div>
                        </section>
                        </div>
                        </body>
                        
</html>