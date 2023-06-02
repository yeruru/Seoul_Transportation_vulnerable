<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>지하철 출입구 경로()</h1>
        <table border="1px solid">
        <thead>
            <tr>
                <th>${name}역</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="item" items="${response}" begin="0" end="0" step="1">
        		<td><img src="${item.imgPath}"></td>
        	</c:forEach>
            <c:forEach var="item" items="${response}">
                <tr>
                    <td>${item.mvContDtl}</td>
                
                </tr>
            </c:forEach>
        </tbody>
        </table>
</body>
</html>