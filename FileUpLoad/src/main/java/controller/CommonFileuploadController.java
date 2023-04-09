package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.face.FileService;
import service.impl.FileServiceImpl;

@WebServlet("/commons/fileupload")
public class CommonFileuploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private FileService fileService = new FileServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getContextPath() + "/commons/fileupload [GET]");
		
		// view를 지정하고 포워드
		req.getRequestDispatcher(req.getContextPath() + "/WEB-INF/views/commons/fileupload.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/commons/fileupload [POST]");

		// multipart/form-data 형식으로 요청하면 null값 반환한다
		// => 파일업로드 라이브러리가 필요함
		System.out.println( "title : " + req.getParameter("title") );

		// 파일 업로드 처리
		boolean result = fileService.fileupload(req);
		
		// 파일 업로드 처리 실패 시 에러 페이지 보여주기
		if ( !result ) {
			req.getRequestDispatcher(req.getContextPath() + "/WEB-INF/views/commons/error.jsp").forward(req, resp);
			return;
		}
		
		// 리다이렉트
		resp.sendRedirect( req.getContextPath() + "/file/list" );
		
		
		
		
		
//		req.getRequestDispatcher("/WEB-INF/views/commons/result.jsp").forward(req, resp);
	
	}
	
}
