package pkg;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.entity.TUser;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String vcode = request.getParameter("vcode");
		HttpSession session = request.getSession();
		String vcoderight = (String) session.getAttribute("vcode");
		if (vcode.equals(vcoderight)) {
			TUser u = UserServise.login(username,password);
			if (u!=null) {
				if(username.equals("admin")) {

					session.setAttribute("username", username);
					session.setAttribute("user", u);
					response.sendRedirect("admin/FoodsAdmin");
				}else {	
				session.setAttribute("username", username);
				session.setAttribute("user", u);
				request.setAttribute("username", username);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/success.jsp");
				rd.forward(request, response);
				}
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
				request.setAttribute("info", "用户名或密码不正确");
				rd.forward(request, response);
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
			request.setAttribute("info", "验证码不正确");
			rd.forward(request, response);
		}

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
