package pkg;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg.entity.Foods;


/**
 * …Ã∆∑œÍ«È
 */
@WebServlet("/foodsDetails")
public class FoodsDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("foodsId");
		try {
			Foods Foods = UserServise.findFoodsById(Integer.parseInt(id));
			request.setAttribute("foods", Foods);
			request.getRequestDispatcher("/WEB-INF/jsp/details.jsp").forward(request,response);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
