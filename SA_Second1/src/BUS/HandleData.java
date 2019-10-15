package BUS;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TestJdbc;


@WebServlet("/HandleData")
public class HandleData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HandleData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String queryName=request.getParameter("Selecttion");
		double res=0;
		
//		List<Double>list=null;
		try
		{
			//Class<?> g = Class.forName("BUS.userBUS");//BUS.userBUS
			Class<?> g =Class.forName("DAO.TestJdbc");
//			getMaxValue getM=(getMaxValue)g.newInstance();
			//userBUS ub=(userBUS)g.newInstance();
			TestJdbc tj=(TestJdbc)g.newInstance();
			//list=getM.getMax();  
			//res=ub.getPriceChange();
			res=tj.getPriChange();
			//request.setAttribute("list", list);
			request.setAttribute("res",res);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(res);//res
		request.getRequestDispatcher("/test.jsp").forward(request, response);// /test.jsp
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
