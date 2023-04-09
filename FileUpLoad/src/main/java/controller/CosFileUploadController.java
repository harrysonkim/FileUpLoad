package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.face.FileService;
import service.impl.FileServiceImpl;

@WebServlet("/cos/fileupload")
public class CosFileUploadController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	// 서비스
	private FileService fileService = new FileServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/cos/fileupload [GET]");
	
		request.getRequestDispatcher(request.getContextPath() + "/WEB-INF/views/cos/fileupload.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/cos/fileupload [POST]");
		
		if ( !fileService.cosFuleupload(request) ) {
			// COS 파일 업로드 실패
			request.getRequestDispatcher(request.getContextPath() + "/WEB-INF/views/cos/error.jsp").forward(request, response);
			return;
			
		}
		
		// 리다이렉트
		response.sendRedirect( request.getContextPath() + "/file/list" );
		
	
	
	
	
	}
}
