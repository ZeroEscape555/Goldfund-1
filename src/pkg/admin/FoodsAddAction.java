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
//		// ��ȡ�ϴ����ļ�
		Part part = request.getPart("foodimg");
		Date d = new Date();
		
		// 2.��������
		// ��ȡ��Ŀ��ʵ������·��
		String appPath = this.getServletContext().getRealPath("/");
		// ʵ�ʵ��ϴ�·��
		String path = appPath + "food" + File.separator;
		// ��ǰʱ����ַ�����ʽ

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");
		// �����ļ���
		String filename = sdf.format(d) + ".jpg";
		// �����ļ���ָ��·����
		System.out.print(path+filename);
		part.write(path + filename);
		
		try {
					try {
						UserServise.addFoods(foodsname, price, details,kind,filename);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					request.setAttribute("info", "��ӳɹ�");
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
