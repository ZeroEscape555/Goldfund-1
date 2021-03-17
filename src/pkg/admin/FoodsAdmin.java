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
 * �̼���ҳ--��Ʒ����ҳ��
 */
@WebServlet("/admin/FoodsAdmin")
public class FoodsAdmin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��session�л�ȡ��Ϣ
		HttpSession session = request.getSession();
		try {
			List<Foods> foodsList = UserServise.findAllFoods();
			request.setAttribute("foodsList", foodsList);
			//ת��
			request.getRequestDispatcher("/WEB-INF/jsp/adminfoodlist.jsp").forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		 * HttpSession session = request.getSession(); Business business =
		 * (Business)session.getAttribute("business"); if(business==null) { //��ʾ��¼ҳ��
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
