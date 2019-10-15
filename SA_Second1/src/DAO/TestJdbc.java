package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
	public   double getPriChange() {
	      List<Double>res=new ArrayList<Double>();
	      Connection conn = null;
	      PreparedStatement ps = null;
	      try {
	          conn=getConnection.getLink();
	          String sql="SELECT * FROM dbo.SaData";
	          ps=conn.prepareStatement(sql);
	          ResultSet rs=ps.executeQuery();
System.out.println("TestJdbc");
	          while(rs.next())
	          {
	              double data=rs.getDouble(5);//开盘价
	              res.add(data);
	          }
	      } catch (Exception e) {
	          e.printStackTrace();
	      }
	      double change=res.get(res.size()-1)-res.get(0);
	return change;
	  }

	    public static void main(String[] args) {
	        TestJdbc g=new TestJdbc();
	        double ans=g.getPriChange();
	        System.out.println(ans);
	    }

}
