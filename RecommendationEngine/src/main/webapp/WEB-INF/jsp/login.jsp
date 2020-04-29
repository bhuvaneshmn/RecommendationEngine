<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="resources/css/style.css" rel="stylesheet" />
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
                   
                    <a class="hiddenanchor" id="registerForm"></a>
                    <div id="wrapper">
                     <div id="login" class="animate form">
                            <form  id="registerForm" action="register-user" method="post" modelAttribute="userDTO" > 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" >Username</label>
                                    <input id="name" name="name" required="required" type="text" placeholder="Enter username" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail"  > Email</label>
                                    <input id="emailid" name="emailid" required="required" type="email" placeholder="Enter mymail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" >Password </label>
                                     <input type="password" id="password" name="password" placeholder="Enter password as per required conditions.."
          pattern="(?=.*\d)(?=.*[a-z]).{8,}" 
     title="Must contain at least one number, lowercase letter and at least 8 or more characters" required>
                                </p>
                              
                               
                                 <p>
                                <label for="dob" class="youdob">Age</label>
                             
                                <input   id="age" name="age" type="number" placeholder="Enter your age"/>
                                 </p>
                                 <p>
                                <label for="phno" class="youphno">Phone Number</label>
                                <input id="mobileNumber" name="mobileNumber" type="number" placeholder="Enter your mobile number" />
                                </p>
                                 <p>
                                <label for="address" class="youad">Address</label>
                                <input id="city" name="city" type="text" placeholder="Enter your address" />
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already Registered?
									<a href="http://localhost:8080/RecommendationEngine/" class="to_register"> Login </a>
								</p>
                            </form>
                        </div>
                        </div>
                        </div>
                        </section>
                        </div>
                        </body>
</html>

