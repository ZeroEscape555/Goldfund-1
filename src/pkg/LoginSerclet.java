package pkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexSerclet
 */
@WebServlet("/Login")
public class LoginSerclet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
//		String username = (String)session.getAttribute("username");
//		if(username==null)
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
//			rd.forward(request, response);
//		}
//		else {
		request.setAttribute("menu_item", "Login");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
			rd.forward(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
