<%--
  Created by IntelliJ IDEA.
  User: Mustafa
  Date: 8/4/2017
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
    response.setHeader("Cache-Control", "no-cache, no-Store, must-revalidate");

    response.setHeader("Pragma","no-cache");

    response.setHeader("Expires","0");

    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("login.jsp");
    }
%>

Videos
<ol>
<iframe width="560" height="315" src="https://www.youtube.com/embed/1pmelTNhQ8o" frameborder="0" allowfullscreen></iframe>

</ol>
</body>
</html>
