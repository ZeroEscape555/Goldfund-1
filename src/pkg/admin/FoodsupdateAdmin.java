package pkg.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.UserServise;
import pkg.entity.Foods;

/**
 * 商家主页--商品管理页面
 */
@WebServlet("/admin/FoodsUpdate")
public class FoodsupdateAdmin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("foodsId");
		try {
			Foods foods = UserServise.findFoodsById(Integer.parseInt(id));
			request.setAttribute("foods", foods);
			request.getRequestDispatcher("/WEB-INF/jsp/foodsUpdate.jsp").forward(request, response);
		} catch (NumberFormatException | SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
