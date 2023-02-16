<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 02/16/2023
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Create</h1>
<form action="/staff/create"method="post">
    <table>
        <tr>
            <th>ID</th>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center">
                <button>Create</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
