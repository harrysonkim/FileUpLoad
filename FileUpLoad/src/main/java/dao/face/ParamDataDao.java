package dao.face;

import java.sql.Connection;

import dto.ParamData;

public interface ParamDataDao {

	/**
	 * 폼 필드(form-data) 전달파라미터 정보를 삽입한다
	 * 
	 * @param conn - DB연결 객체
	 * @param paramData - DB에 저장할 전달파라미터 정보
	 * @return 삽입 수행 결과 ( 1 - 정산 삽입, 0 - 삽입 실패)
	 */
	public int insert(Connection conn, ParamData paramData);

}
