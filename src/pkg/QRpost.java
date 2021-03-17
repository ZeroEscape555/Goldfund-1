package pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
/**
 * Servlet implementation class QRpost
 */
@MultipartConfig
@WebServlet("/Pay")
public class QRpost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QRpost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取当前项目的实际物理地址
		String path = this.getServletContext().getRealPath("/")+File.separator+"photo"+File.separator;
		request.setCharacterEncoding("UTF-8");
//		String width =request.getParameter("content");
//		String height = request.getParameter("content");
//		String width = request.getParameter("content");
//		String height =request.getParameter("content");
		String content ="https://b.alipay.com/index2.htm"; 
//				request.getParameter("content");
		String width = "350";
		String height = "400";
//		try {
//			QRcode(content, Integer.parseInt(width), Integer.parseInt(height), path);
//		} catch (NumberFormatException | WriterException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		request.setAttribute("content", content);
		request.setAttribute("width", width);
		request.setAttribute("height", height);
		request.setAttribute("photo", "QR.jpg");
		request.getRequestDispatcher("WEB-INF/jsp/QRshow.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void QRcode(String content, int width, int height, String path) throws WriterException, IOException {
//		HashMap hints = new HashMap();
//		//字符编码
//		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
//		//容错级别
//		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
//		//定义二维码对象
//		BitMatrix bm = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
//		OutputStream os = new FileOutputStream(path+"QR.jpg");
//		MatrixToImageWriter.writeToStream(bm, "jpg", os);
	}

}