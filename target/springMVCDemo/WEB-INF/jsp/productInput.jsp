<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include.jsp"%>
<html>
<head>
    <title>Product Input</title>
</head>
<body>
    <div>
        <form:form commandName="product" action="/demo/product/save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <p>
                    <form:errors path="name" />
                </p>
                <p>
                    <label for="name">Product name : </label>
                    <form:input path="name" type="text" id="name" tabindex="1"/>
                </p>
                <p>
                    <form:errors path="description" />
                </p>
                <p>
                    <label for="description">Product description : </label>
                    <form:input path="description" type="text" id="description" tabindex="2"/>
                </p>
                <p>
                    <form:errors path="price" />
                </p>
                <p>
                    <label for="price">Product price : </label>
                    <form:input path="price" type="text" id="price" tabindex="3"/>
                </p>
                <p>
                    <form:errors path="updateTime" />
                </p>
                <p>
                    <label for="updateTime">Product update time (yyyy-MM-dd) : </label>
                    <form:input path="updateTime" type="text" id="updateTime" tabindex="4"/>
                </p>
                <p>
                    <input type="reset" value="Reset"/>
                    <input type="submit" tabindex="5" value="Add product"/>
                </p>
            </fieldset>
        </form:form>
    </div>
</body>
</html>
