package dao.face;

import java.sql.Connection;
import java.util.List;

import dto.UploadFile;

public interface FileDao {

	List<UploadFile> selectAll(Connection conn);


}
