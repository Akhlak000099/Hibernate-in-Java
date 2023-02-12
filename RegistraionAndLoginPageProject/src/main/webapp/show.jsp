<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2>Worker Details Table</h2>


<table>
  <tr>
    <th>Full Name</th>
    <th>Emp. Id</th>
    <th>Email</th>
    <th>Phone No.</th>
    <th>Department</th>
    <th>Salary</th>
    <th>Update</th>
    <th>Delete</th>
  </tr>

 
  <c:forEach var="users" items="${listUser}">
    <tr>
  <td><c:out value="${users.name}" /></td>
    <td><c:out value="${users.emp_id}" /></td>
    <td><c:out value="${users.email}" /></td>
    <td><c:out value="${users.ph}" /></td>
    <td><c:out value="${depaterment}"/></td>
    <td><c:out value="${users.salary}" /></td>
    <td>Germany</td>
    <td>Mexico</td>
  </tr>
  
  </c:forEach>
</table>

</body>
</html>