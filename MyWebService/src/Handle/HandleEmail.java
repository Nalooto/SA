package Handle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Client.WebService;
import Client.WebServiceService;
import Client.VaildateEmailAddress;

/**
 * Servlet implementation class HandEmail
 */
@WebServlet("/HandleEmail")
public class HandleEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HandleEmail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String des = request.getParameter("des");
		String context = request.getParameter("context");
		int flag = 0;
		int flag2=0;
		WebService ws = new WebServiceService().getWebServicePort();
		int  res = 0;//判断发送结果
		
		for (int i = 0; i < des.length(); i++) 
		{
			if (des.charAt(i) == ',') {
				flag = 1;
				break;
			}
		}
		if (flag == 1) 
		{
			String[] url = des.split(",");
			System.out.print("解析完之后的字符串是：" + '\n');
			List<String> list = new ArrayList<String>();
			for (String u : url) 
			{
				if(ws.vaildateEmailAddress(u)==false)
				{
					res=0;
					flag2=1;
					break;
				}
				else
					list.add(u);
				System.out.println("Email:" + u);
			}
			res = ws.sendEmailBatch(list, context);
		} 
		else 
		{
			if (ws.vaildateEmailAddress(des) == false) 
			{
				flag2=1;
				res = 0;
			} 
			else 
			{
				res = ws.sendEmail(des, context);
			}
		}
		String reString = " ";
		if (res == 1) 
		{
			reString = "发送成功!";
		} else {

			reString = "发送失败!";
		}
		if(flag2==1)
		{
			request.getRequestDispatcher("/Error.jsp").forward(request, response);  	
		}
		else
		{
			request.setAttribute("res", reString);
			request.getRequestDispatcher("/Result.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

