package pkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResImage
 */
@WebServlet("/ResImage")
public class ResImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("image/html");
		Random r = new Random();
		int rn = r.nextInt(8999)+1000;
		String vcode = String.valueOf(rn);
		
		HttpSession session = request.getSession();
		session.setAttribute("vcode", vcode);
		
		BufferedImage img = new BufferedImage(70,30,BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics g = img.getGraphics();
		
		g.setColor(Color.white);
		
		g.fillRect(0, 0, 70, 70);
		
		g.setColor(Color.black);
		g.setFont(new Font (null,Font.BOLD,24));
		g.drawString(vcode,10,25);
		
		OutputStream os =  response.getOutputStream();
		ImageIO.write(img, "jpg", os);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
