
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<s:fielderror/>
<table border="1">

    <tr><td>用户名</td><td>用户名</td></tr>
   <s:iterator value="list">
       <tr> <td>${username}</td><td>${password}</td></tr>
   </s:iterator>
</table>
</body>
</html>
