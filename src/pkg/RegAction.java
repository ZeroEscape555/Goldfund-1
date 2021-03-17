package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.entity.TUser;

/**
 * Servlet implementation class IndexSerclet
 */
@WebServlet("/RegAction")
public class RegAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String username = new String(request.getParameter("username").getBytes("iso-8859-1"), "utf-8"); 

		String password = new String(request.getParameter("password").getBytes("iso-8859-1"), "utf-8"); 

		String sex = new String(request.getParameter("sex").getBytes("iso-8859-1"), "utf-8"); 

		String address = new String(request.getParameter("address").getBytes("iso-8859-1"), "utf-8"); 


		String phonenumber = new String(request.getParameter("phonenumber").getBytes("iso-8859-1"), "utf-8"); 


		String email = new String(request.getParameter("email").getBytes("iso-8859-1"), "utf-8"); 

		String[] strongs = request.getParameterValues("hobby");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String time = sdf.format(new Date());
		
//		UserServise.reg(username,password, sex, address, phonenumber, email);
		request.setAttribute("username", username);

		request.setAttribute("password", password);

		request.setAttribute("sex", sex);
		
		request.setAttribute("time", time);

		request.setAttribute("address", address);
		
		request.setAttribute("phonenumber", phonenumber);

		request.setAttribute("email", email);
		
		request.getRequestDispatcher("WEB-INF/jsp/regsuccess.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
