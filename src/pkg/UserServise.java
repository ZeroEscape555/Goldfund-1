package pkg;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pkg.entity.Cart;
import pkg.entity.Foods;
import pkg.entity.TUser;

public class UserServise {
	
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// ��������

			String url = "JDBC:mysql://localhost:3306/elm?useUnicode=true&characterEncoding=UTF-8";
			String user = "root";
			String pwd = "123456";

			Connection conn = DriverManager.getConnection(url, user, pwd);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void reg(String username, String password, String sex, String address, String phonenumber,
			String email) {

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

		String sql = "insert into users(username,password,sex,address,phonenumber,email)value('" + username + "','"
				+ password + "','" + sex + "','" + address + "','" + phonenumber + "','" + email + "')";

		try {
			runner.execute(conn, sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		

	}

	//ɾ��item
	public static void deleteItem(int id) {

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

		String sql = "DELETE FROM cart WHERE foodid =?";

		try {
			runner.execute(conn, sql,id);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		

	}
	public static TUser login(String username, String password) {

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

//		String sql = "insert into users(username,password,sex,major,birth) values(\"clh\",\"12345\",\"M\",\"computer\",\"2000-01-01\")";
//		runner.execute(conn, sql);

		String sql = "select * from users where username =? and password =?";
		List<TUser> users = null;
		try {
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), username, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (users.size() > 0) {
			return users.get(0);
		} 
		else {
			return null;
		}
	}

//	public static (String username,String password) {
//		
//	}
	public static List<TUser> getAllUser() {
		// ע������

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

//		String sql = "insert into users(username,password,sex,major,birth) values(\"clh\",\"12345\",\"M\",\"computer\",\"2000-01-01\")";
//		runner.execute(conn, sql);

		String sql = "select * from users";
		List<TUser> users = new ArrayList<>();
		try {
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));

			DbUtils.closeQuietly(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;

	}

	// ��ȡ���в�Ʒ
	public static List<Foods> findAllFoods() throws SQLException {

		// ��ȡ����
		Connection conn = UserServise.getConnect();

		// 1.����QueryRunner������������sql���
		QueryRunner qr = new QueryRunner();

		// 2.����SQL���
		String sql = "SELECT * FROM food";

		// 3.ִ��SQL���
		List<Foods> foodsList = qr.query(conn, sql, new BeanListHandler<Foods>(Foods.class));

		// 4.�ر������Դ
		DbUtils.close(conn);

		return foodsList;
	}

//	��һҳ�Ĳ�Ʒ
	public static List<Foods> findFoods(int pageSize, int pageNo, String key) throws SQLException {

		key = "%" + key + "%";

		// ��ȡ����
		Connection conn = UserServise.getConnect();

		// 1.����QueryRunner������������sql���
		QueryRunner qr = new QueryRunner();

		// 2.����SQL���
		String sql = "SELECT * FROM food " + "WHERE foodname LIKE ?" + " ORDER BY foodid LIMIT ?,?;";
//		System.out.print(sql);

		// 3.ִ��SQL���
		List<Foods> foodsList = qr.query(conn, sql, new BeanListHandler<Foods>(Foods.class), key,
				(pageNo - 1) * pageSize, pageSize);

		// 4.�ر������Դ
		DbUtils.close(conn);

		return foodsList;
	}

	public static List<TUser> searchUsers(String key) {
		// ע������

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

//		String sql = "insert into users(username,password,sex,major,birth) values(\"clh\",\"12345\",\"M\",\"computer\",\"2000-01-01\")";
//		runner.execute(conn, sql);

		String sql = "select * from users where username like '%" + key + "%' or major like '%" + key + "%'";
		List<TUser> users = new ArrayList<>();
		try {
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));

			DbUtils.closeQuietly(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;

	}

	public static TUser userDetil(int id) {

		// ע������

		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();

//		String sql = "insert into users(username,password,sex,major,birth) values(\"clh\",\"12345\",\"M\",\"computer\",\"2000-01-01\")";
//		runner.execute(conn, sql);

		String sql = "select * from users where Id =?";
		List<TUser> users = null;
		try {
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (users.size() > 0) {
			return users.get(0);
		} else
		{
			return null;
		}
			

	}

	public static void newLog(String ip, java.util.Date date, String uri) {
		// TODO Auto-generated method stub
		Connection conn = UserServise.getConnect();
		QueryRunner runner = new QueryRunner();
		String sql = "insert into t_log(ip,Time,URI) values(" + ip + "," + date + "," + uri + ")";
		try {
			runner.execute(conn, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Foods findFoodsById(int id) throws SQLException {
		// TODO Auto-generated method stub
		// ��ȡ����
		Connection conn = UserServise.getConnect();

		// 1.����QueryRunner������������sql���
		QueryRunner qr = new QueryRunner();

		// 2.����SQL���
		String sql = "select * from food where foodid = ? ;";
		// 3.ִ��SQL���
		Foods foods = qr.query(conn, sql, new BeanHandler<Foods>(Foods.class), id);

		// 4.�ر������Դ
		DbUtils.close(conn);

		return foods;
	}

	// ��ӹ��ﳵ
	public static void addCartItem(long userId, int foodsId, int num) throws ClassNotFoundException, SQLException {

		// ��ȡ����
		Connection conn = UserServise.getConnect();

		// 1.����QueryRunner������������sql���
		QueryRunner qr = new QueryRunner();

		// 2.����SQL���
		// ��������ӣ����������
		String sql = "INSERT INTO cart(userid,foodid,foodnum) VALUES(?, ?, ?) ON DUPLICATE KEY UPDATE foodnum=foodnum+ ? ;";
		System.out.print(sql+foodsId+userId+num);
		// 3.ִ��SQL���
		qr.update(conn, sql, userId, foodsId, num, num);

		// 4.�ر������Դ
		DbUtils.close(conn);

	}

	//��ȡ���ﳵ����
		public static List<Cart> getCartItemds(long userId) throws SQLException {

			// ��ȡ����
			Connection conn = UserServise.getConnect();

			// 1.����QueryRunner������������sql���
			QueryRunner qr = new QueryRunner();

			// 2.����SQL���
			String sql = "SELECT food.foodid,food.foodname,food.imgp,food.foodprice,cart.foodnum from cart,food WHERE cart.foodid=food.foodid AND userid  = ?";

			// 3.ִ��SQL���
			List<Cart> items = qr.query(conn, sql, new BeanListHandler<Cart>(Cart.class), userId);

			// 4.�ر������Դ
			DbUtils.close(conn);

			return items;
		}
		// �޸Ĳ�Ʒ��Ϣ
		public static void updateFoods(String itemname, int id, BigDecimal price, String details,String kind)
				throws ClassNotFoundException, SQLException {

			// ��ȡ����
			Connection conn = UserServise.getConnect();

			// 1.����QueryRunner������������sql���
			QueryRunner qr = new QueryRunner();

			// 2.����SQL���
			String sql = "update food set foodname=?,foodprice=?,foodds=?,foodkind=? where foodid= ? ";

			// 3.ִ��SQL���
			qr.update(conn, sql, itemname, price, details, kind,id);

			// 4.�ر������Դ
			DbUtils.close(conn);

		}
		// ��Ӳ�Ʒ��Ϣ
		public static void addFoods(String itemname, BigDecimal price, String details,String kind, String imgname)
				throws ClassNotFoundException, SQLException {

			// ��ȡ����
			Connection conn = UserServise.getConnect();

			// 1.����QueryRunner������������sql���
			QueryRunner qr = new QueryRunner();

			// 2.����SQL���
			String sql = "insert into food(foodname,foodprice,foodkind,foodds,imgp) " + "VALUES( ? , ? , ? , ? , ?)";

			// 3.ִ��SQL���
			qr.update(conn, sql, itemname, price,kind,details, imgname);

			// 4.�ر������Դ
			DbUtils.close(conn);

		}
}