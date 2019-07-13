
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/22
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty sessionScope.user}">

    <a href="loginPage">登录</a>&nbsp;&nbsp;<a href="registerPage">注册</a><br>

</c:if>
<c:if test="${!empty sessionScope.user}">

    你好啊，${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="logout">退出登录</a>

</c:if>
<%--<a href="login.jsp">登录</a>&nbsp;&nbsp;<a href="register.jsp">注册</a><br>--%>

<a href="addBlogPage">写Blog</a><br>
<table>
    <c:forEach items="${blogPageInfo.list}" var="showblog">

        <tr>
            <td colspan="4"><a href="showblog?bid=${showblog.bid}">${showblog.btitle}</a></td>
        </tr>
        <tr>
            <td colspan="4">${showblog.bcontent}</td>
        </tr>
        <tr>
            <td>作者：${showblog.uid}</td>
            <td>发布时间：${showblog.bdate}</td>
            <td>点赞数：${showblog.blike}</td>
            
        </tr>
    </c:forEach>


</table>
<c:if test="${blogPageInfo.isFirstPage}">
    首页|
    上一页
</c:if>
<c:if test="${!blogPageInfo.isFirstPage}">
    <a href="home?pageNum=${blogPageInfo.firstPage}">首页</a>|
    <a href="home?pageNum=${blogPageInfo.prePage}">上一页</a>
</c:if>

<c:if test="${blogPageInfo.isLastPage}">
    下一页|
    尾页
</c:if>
<c:if test="${!blogPageInfo.isLastPage}">
    <a href="home?pageNum=${blogPageInfo.nextPage}">下一页</a>|
    <a href="home?pageNum=${blogPageInfo.lastPage}">尾页</a>
</c:if>
</body>
</html>
