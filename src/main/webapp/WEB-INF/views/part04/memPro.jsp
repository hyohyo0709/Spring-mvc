<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Member Data</p>
<p> 이름 : ${name }</p>
<p> 나이 : ${age }</p>
<hr />



<!--클래스 명 앞 글자 소문자로 바꾸고   -->
<p>Member Data</p>
<p> 이름 : ${memDTO.name }</p>
<p> 나이 : ${memDTO.age }</p>
<hr />


<p>Member Data</p>
<p> 이름 : ${mdo.name }</p>
<p> 나이 : ${mdo.age }</p>
<hr />
</body>
</html>