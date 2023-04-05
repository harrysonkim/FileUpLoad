<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/cos/fileupload.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body class="container text-center">

<h1>파일 업로드</h1>
<h3>COS FileUpload</h3>
<hr>

<form action="<%= request.getContextPath() %>/cos/fileupload" method="post" enctype="multipart/form-data">

	<label>제목 <input type="text" name="title" ></label><br>
	<label>이름 <input type="text" name="username" ></label><br>
	<label>과일 <input type="text" name="fruit" ></label><br>

	<label>파일 <input type="file" name="upfile" ></label><br><br>

	<button>전송</button>





</form>






</body>
</html>