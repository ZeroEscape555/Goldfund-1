package pkg;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg.entity.TUser;

/**
 * Servlet implementation class UserList
 */
@WebServlet("/admin/UserUpdata")
public class UserUpdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		//1获取用户数据
//		List<TUser> users = UserServise.getAllUser();
//		request.setAttribute("users", users);
		String id = request.getParameter("id");
		TUser u = UserServise.userDetil(Integer.parseInt(id));
		request.setAttribute("user", u);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/userUpdata.jsp");
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
