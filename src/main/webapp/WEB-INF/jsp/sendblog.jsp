<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/22
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="addblog" method="post" enctype="multipart/form-data">
        Blog标题：<input name="btitle" type="text"><br>
        Blog正文：<input name="bcontent" type="text"><br>
        上传图片：<input name="file" type="file">
        <input type="submit" value="submit">

    </form>

</body>
</html>
