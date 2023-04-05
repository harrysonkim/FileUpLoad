<%@page import="java.util.List"%>
<%@page import="dto.UploadFile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <% List<UploadFile> uploadFileList = (List<UploadFile>) request.getAttribute("FileList"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body class="container">

<h1 class="text-center mt-5">업로드된 파일 리스트</h1>
<table class="table text-center mt-5">

	<tr class="col">
		<th class="col-2">파일 번호</th>
		<th class="col-3">미리보기</th>
		<th class="col-2">원본파일명</th>
		<th class="col-3">바뀐파일명</th>
		<th class="col-2">다운</th>
	</tr>
	
	<% for(int i=0; i < uploadFileList.size(); i++){ %>
	<tr>

		<!-- 파일번호 -->
		<td><%= uploadFileList.get(i).getFileno()%></td>

		<!-- 프리뷰 -->
		<td>
			<img width="100" height="100" src="<%= request.getContextPath() %>/upload/<%= uploadFileList.get(i).getStoredName() %>">
		</td>

		<!-- 원본파일명 -->
		<td>
			<a href="<%= request.getContextPath() %>/upload/<%= uploadFileList.get(i).getStoredName() %>" target="_blank">
				<%= uploadFileList.get(i).getOriginName()%>
			</a>
		</td>

	<!-- 파일명	 -->
		<td><%= uploadFileList.get(i).getStoredName()%></td>

	<!-- 다운로드 -->
	<!-- * download 속성의 값은 다운 받았을때, 파일명을 지정해준다 -->
		<td>
			<a href="<%= request.getContextPath() %>/upload/<%= uploadFileList.get(i).getStoredName() %>" download ="<%= uploadFileList.get(i).getStoredName() %>">
				다운받기
			</a>
		</td>
	</tr>
	<% } %>
	
</table>
	<div class="text-end">
		<a class="" href = "<%= request.getContextPath() %>/commons/fileupload"><button>COMMONS</button></a>
		<a class="" href = "<%= request.getContextPath() %>/cos/fileupload"><button>COS</button></a>
	</div>
	<div class="text-end">
	컨텍스트 패스 : <%= request.getContextPath() %>
	</div>
</body>
</html>