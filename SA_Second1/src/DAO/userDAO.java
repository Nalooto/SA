package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userDAO {
	
	
	public ResultSet getPrice() {//获取数据表
	        Connection conn = null;
	        PreparedStatement ps = null;
	       ResultSet rs = null;
	        try {
	            conn = getConnection.getLink();
	            String sql = "SELECT * FROM dbo.SaData";
	            ps = conn.prepareStatement(sql);
	             rs = ps.executeQuery();
	             System.out.println("dataTable"+rs);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return rs;
	    }
	
	 
	 
}
