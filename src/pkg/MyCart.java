package pkg;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.entity.Cart;
import pkg.entity.TUser;


/**
 * 我的购物车
 */
@WebServlet("/user/MyCart")
public class MyCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		TUser user = (TUser)session.getAttribute("user");
//		System.out.print(username);
//		System.out.print(user);
		if(username==null)
		{
			response.sendRedirect("/WEB-INF/jsp/details.jsp");
		}
		else {
			try {
			List<Cart> items = UserServise.getCartItemds(user.getId());
			request.setAttribute("items", items);
			request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp").forward(request, response);
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
