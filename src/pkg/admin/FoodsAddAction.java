package pkg.admin;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import pkg.UserServise;



@MultipartConfig
@WebServlet("/admin/FoodsAddAction")
public class FoodsAddAction extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("foodid");
		String foodsname = request.getParameter("foodname");
		String sPrice = request.getParameter("foodprice");
		String details = request.getParameter("foodds");
		String kind = request.getParameter("foodkind");
		BigDecimal price = new BigDecimal(sPrice);
//		String filename ="123.jpg";
//
//		System.out.print(id+foodsname+sPrice+details+kind);
//		// 获取上传的文件
		Part part = request.getPart("foodimg");
		Date d = new Date();
		
		// 2.处理数据
		// 获取项目的实际物理路径
		String appPath = this.getServletContext().getRealPath("/");
		// 实际的上传路径
		String path = appPath + "food" + File.separator;
		// 当前时间的字符串格式

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");
		// 生成文件名
		String filename = sdf.format(d) + ".jpg";
		// 保存文件到指定路径下
		System.out.print(path+filename);
		part.write(path + filename);
		
		try {
					try {
						UserServise.addFoods(foodsname, price, details,kind,filename);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					request.setAttribute("info", "添加成功");
					request.getRequestDispatcher("FoodAdd").forward(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
