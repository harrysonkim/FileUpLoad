package dao.face;

import java.sql.Connection;

import dto.UploadFile;

public interface UploadFileDao{

	/**
	 * 첨부파일 정보 삽입하기
	 * 
	 * @param conn - DB연결객체
	 * @param paramData - 업로드된 파일의 정보
	 * @return 삽입 수행 결과 (1 - 정상삽입, 0 - 삽입 실패)
	 */
	int insert(Connection conn, UploadFile uploadFile);

}
