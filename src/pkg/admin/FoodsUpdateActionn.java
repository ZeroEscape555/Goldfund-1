package pkg.admin;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import pkg.UserServise;
/**
 * 商品信息修改
 */
@WebServlet("/admin/FoodsUpdateAction")
public class FoodsUpdateActionn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("foodid");
		String foodsname = request.getParameter("foodname");
		String sPrice = request.getParameter("foodprice");
		String details = request.getParameter("foodds");
		String kind = request.getParameter("foodkind");
		BigDecimal price = new BigDecimal(sPrice);

		try {
			try {
				UserServise.updateFoods(foodsname, Integer.parseInt(id), price, details,kind);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("info", "修改成功");
			request.getRequestDispatcher("FoodsAdmin").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
