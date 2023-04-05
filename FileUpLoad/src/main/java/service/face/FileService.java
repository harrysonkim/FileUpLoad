package service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dto.UploadFile;

public interface FileService {
	/**
	 * multipart/form-data 인코딩으로 전달될 요청 데이터를 처리한다
	 * DB에 전달데이터 정보를 저장한다
	 * 
	 * @param req - 요청 정보 객체
	 * @return 파일 업로드 처리 성공/실패 결과
	 */
	public boolean fileupload(HttpServletRequest req);

	public List<UploadFile> list();

	/**
	 * COS라이브러리를 이용한 파일 업로드 처리
	 * 폼필드, 파일 전부 처리 가능
	 * 
	 * @param request - 요청 정보 객체
	 * @return COS파일 업로드 성공/실패
	 */
	public boolean cosFuleupload(HttpServletRequest request);
	
	
}
