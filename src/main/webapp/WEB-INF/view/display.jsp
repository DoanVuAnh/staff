<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 02/16/2023
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Employee</h1> <br><br>
<h3><a href="/staff/create" style="margin-top: 20px;margin-left: 200px"> Create New staff</a></h3>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Name</th>
        <th scope="col" colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="element" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${element.getName()}</td>
            <td><a href="/staff/edit?id=${element.id}">Edit</a></td>
            <td><a href="/staff/delete?id=${element.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
