<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include.jsp"%>
<html>
<head>
    <title>Product Detail</title>
    <style type="text/css">@import url(<c:url value="/css/test.css"/>);</style>
</head>
<body>
    <table>
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>${product.updateTime}</td>
        </tr>
    </table>
</body>
</html>
