package BUS;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DAO.userDAO;

public class userBUS {
	  private userDAO _userDAO;

    
      public double getPriceChange() {//获取开盘价至今的价格变化
          double res=0;
          List<Double> list=new ArrayList<Double>();
          try{
              ResultSet rs=_userDAO.getPrice();
              while(rs.next())
              {
                  double data=rs.getDouble(5);//开盘价
                  list.add(data);
              }
          }catch (Exception e){e.printStackTrace();}
            res=list.get(list.size()-1)-list.get(0);
            System.out.println("运行到这里");
          return res;
      }
      
      
      
  }

