package pkg;

import java.io.IOException;

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
@WebServlet("/kf")
public class kfSerclet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		TUser user = (TUser)session.getAttribute("user");
//		System.out.print(username);
//		System.out.print(user);
//		if(username==null)
//		{
//			response.sendRedirect("Login");
//		}
//		else {
			request.setAttribute("menu_item", "Index");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/customerService.html");
			rd.forward(request, response);
		}
		
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
