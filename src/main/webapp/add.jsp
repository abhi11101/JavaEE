<%--
  Created by IntelliJ IDEA.
  User: Abhijeet
  Date: 21-06-2023
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
</head>
<body>
<%
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));
    int k = i+j;
    System.out.println("Add is "+ k);
        out.println("Result is " +k);
%>
</body>
</html>
