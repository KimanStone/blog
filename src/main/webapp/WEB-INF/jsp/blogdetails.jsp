<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/22
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>${blogDetail.btitle}</h2>
    <div>作者：${blogDetail.uid}&nbsp;&nbsp;发布时间：${blogDetail.bdate}&nbsp;&nbsp;点赞数：${blogDetail.blike}     评论数：${blogDetail.commentList.size()}</div>
    <p>${blogDetail.bcontent}</p><br>
    <img src="${blogDetail.bpicture}">
    <div>
        <form action="addcomment">
            <input name="ccontent" type="text">
            <input name="bid" type="hidden" value="${blogDetail.bid}">
            <input type="submit" value="评论">
        </form>

    </div>
<table>
    <tr>
        <td>评论</td>
        <td>日期</td>
        <td>uid</td>
    </tr>
    <c:forEach items="${blogDetail.commentList}" var="comment">
        <tr>
            <td>${comment.ccontent}</td>
            <td>${comment.cdate}</td>
            <td>${comment.uid}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
