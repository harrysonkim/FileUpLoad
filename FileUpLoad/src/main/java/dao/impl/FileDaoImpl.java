package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import dao.face.FileDao;
import dto.UploadFile;

public class FileDaoImpl implements FileDao{

	@Override
	public List<UploadFile> selectAll(Connection conn) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<UploadFile> list = new ArrayList<>();
		
		String sql = "";
		sql += "select * from uploadfile";
		sql += " ORDER BY fileno DESC";
		
		try {

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) {
		
				UploadFile uploadFile = new UploadFile();
				
				uploadFile.setFileno( rs.getInt("fileno"));
				uploadFile.setOriginName( rs.getString("origen_name") );
				uploadFile.setStoredName( rs.getString("stored_name") );
				
				list.add( uploadFile );
			}
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		
		System.out.println("FileDaoImpl selectALL()" + list);
		return list;
	}


}
