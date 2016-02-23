<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<#import "spring.ftl" as spring />
<html>
<head>
    <link href="<@spring.url'/css/test.css'/>" rel="stylesheet" media="screen"/>
    <script type="text/javascript" src="<@spring.url'/jquery/jquery-1.12.0.js'/>"></script>
    <script type="text/javascript">
        $(function() {
            $('#aa').html('2aa' + '${content}');
        });
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
<p id="aa">2</p>

</body>
</html>