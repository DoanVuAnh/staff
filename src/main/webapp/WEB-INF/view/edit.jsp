<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2/17/2023
  Time: 1:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit</h1>
<form action="/staff/edit?id=${staff.id}"method="post">
  <table>
    <tr>
      <th>ID</th>
      <td>${staff.id}</td>
    </tr>
    <tr>
      <th>Name</th>
      <td><input type="text" name="name" value="${staff.name}"></td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center">
        <button>Edit</button>
      </td>
    </tr>
  </table>
</form>

</body>
</html>
