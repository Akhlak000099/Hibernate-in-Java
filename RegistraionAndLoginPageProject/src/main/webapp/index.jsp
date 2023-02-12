<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>Registraion Page to Register</title>
    <link rel="stylesheet" href="style.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Registration</div>
   
    <%
     String msg=(String) session.getAttribute("msg");
    if(msg!=null){
    	%>
    	<p class="title"><%=msg%></p>
    	<%
              	
    }
    session.removeAttribute("msg");
    %>
    <div class="content">
      <form action="registerServlet" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" placeholder="Enter your name" name="name" required>
          </div>
          <div class="input-box">
            <span class="details">Emp. Id</span>
            <input type="text" placeholder="Enter your Emp. Id" name="empId" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" placeholder="Enter your email" name="email" required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="number" placeholder="Enter your number" name="ph" required>
          </div>
          <div class="input-box">
            <span class="details">Depaterment</span>
            <input type="text" placeholder="Enter your depaterment" name="depaterment" required>
          </div>
           <div class="input-box">
            <span class="details">Salary</span>
            <input type="number" placeholder="Enter your salary" name="salary" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" placeholder="Enter your password" name="password" required>
          </div>
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="text" placeholder="Confirm your password" name="cpassword" required>
          </div>
          
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1" value="Male">
          <input type="radio" name="gender" id="dot-2" value="Female">
          <input type="radio" name="gender" id="dot-3" value="Other">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
        <div class="button">
          <a href="login.jsp" style="text-decoration: none;background: linear-gradient(-135deg, #71b7e6, #9b59b6); padding: 15px 30px; width: 100%; border-radius: 10px;color:white; font-size: 18px;font-weight: 500;letter-spacing: 1px;">
          Login</a>
        </div>
      </form>
    </div>
  </div>

</body>
</html>