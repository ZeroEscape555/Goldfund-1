package pkg;

import java.io.IOException;
import java.sql.SQLException;
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
 * 添加到购物车
 */
@WebServlet("/user/AddItemCart")
public class AddItemCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		TUser user = (TUser)session.getAttribute("user");
		Enumeration es = session.getAttributeNames();
		while (es.hasMoreElements()) {
		            String sessionName = (String) es.nextElement();
		            System.out.println("\nsession item name=" + sessionName);
		            System.out.println("\nsession item value=" + request.getSession().getAttribute(sessionName));
		        }
		if (username == null) {
			String info = "请先登入后完成此操作！！！";
			request.setAttribute("info", info);
			request.getRequestDispatcher("//Login").forward(request, response);
		} else {
			String foodsId = request.getParameter("foodsId");
			String num = request.getParameter("num");
			System.out.print(username);
			try {
				//添加商品到购物车
				UserServise.addCartItem(user.getId(), Integer.parseInt(foodsId), Integer.parseInt(num));
				request.getRequestDispatcher("/user/MyCart").forward(request, response);
			
			
			
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
