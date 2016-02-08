<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Input</title>
</head>
<body>
    <div>
        <form action="/product/save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <p>
                    <label for="name">Product name : </label>
                    <input type="text" id="name" tabindex="1"/>
                </p>
                <p>
                    <label for="description">Product description : </label>
                    <input type="text" id="description" tabindex="2"/>
                </p>
                <p>
                    <label for="price">Product price : </label>
                    <input type="text" id="price" tabindex="3"/>
                </p>
                <p>
                    <input type="reset" tabindex="4" value="Reset"/>
                    <input type="submit" tabindex="5" value="Add product"/>
                </p>
            </fieldset>
        </form>
    </div>
</body>
</html>
