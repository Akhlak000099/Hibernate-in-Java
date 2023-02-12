<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="style.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Login</div>
    <div class="content">
      <form action="login" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Emp. Id</span>
            <input type="text" placeholder="Enter your Emp. Id" name="empId" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" placeholder="Enter your email" name="email" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" placeholder="Enter your password" name="password" required>
          </div>
        <div class="button">
          <input type="submit" value="Login" style="width: 300px">
        </div>
      </form>
    </div>
  </div>

</body>
</html>