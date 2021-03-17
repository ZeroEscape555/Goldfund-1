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

import pkg.entity.Foods;
import pkg.entity.Page;
import pkg.entity.TUser;

/**
 * Servlet implementation class UserList
 */
@WebServlet("/FoodList")
public class Foodlist extends HttpServlet {	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageNo = request.getParameter("pageNo");
		request.setCharacterEncoding("UTF-8");
		
		if(pageNo==null||pageNo.length()==0) {
			pageNo = "1";
		}
		
		String key = request.getParameter("key");
		
		if(key==null||key.length()==0) {
			key = "";
		}
		else{
			key = new String(key.getBytes("iso-8859-1"),"UTF-8");
		}
		try {
			List<Foods> foodsList1 = UserServise.findAllFoods();
			Page page = new Page(foodsList1.size(),Integer.parseInt(pageNo),6);
			page.setTotalRecord(foodsList1.size());
			page.setQueryKey(key);
			List<Foods> foodsList = UserServise.findFoods(page.getPageSize(),Integer.parseInt(pageNo),key);
			System.out.print(foodsList);
			request.setAttribute("foodsList", foodsList);
			request.setAttribute("page", page);
			request.getRequestDispatcher("/WEB-INF/jsp/foodlist.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
