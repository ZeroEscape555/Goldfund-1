package pkg;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.entity.TUser;

/**
 * Servlet Filter implementation class RoleFilter
 */
@WebFilter("/RoleFilter")
public class RoleFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req  =(HttpServletRequest)request;
		HttpServletResponse resp  =(HttpServletResponse)response;
		System.out.print("start!");
		HttpSession session = req.getSession();
		TUser user = (TUser)session.getAttribute("user");
		if(user!=null) {
		chain.doFilter(request, response);
		}
		else {
			request.setAttribute("info", "«Îœ»µ«»Î");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
			rd.forward(request,response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
