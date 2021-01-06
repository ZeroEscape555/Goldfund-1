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
@WebServlet("/admin/FoodsAdmin")
public class FoodsAdmin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//从session中获取信息
		HttpSession session = request.getSession();
		try {
			List<Foods> foodsList = UserServise.findAllFoods();
			request.setAttribute("foodsList", foodsList);
			//转发
			request.getRequestDispatcher("/WEB-INF/jsp/adminfoodlist.jsp").forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		 * HttpSession session = request.getSession(); Business business =
		 * (Business)session.getAttribute("business"); if(business==null) { //显示登录页面
		 * response.sendRedirect("../Login"); }
		 * 
		 * else {  }
		 */
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
