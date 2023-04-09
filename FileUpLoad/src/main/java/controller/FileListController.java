package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UploadFile;
import service.face.FileService;
import service.impl.FileServiceImpl;

@WebServlet("/file/list")
public class FileListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(req.getContextPath() + "/commons/fileupload [GET]");

		FileService fileService = new FileServiceImpl();
		
		List<UploadFile> FileList = fileService.list();
		
		req.setAttribute("FileList", FileList);
		
		// view를 지정하고 포워드
		req.getRequestDispatcher(req.getContextPath() + "/WEB-INF/views/file/list.jsp").forward(req, resp);
	}


}
