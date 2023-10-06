

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String sessionid = null;
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("sessionid")) {
					sessionid = cookies[i].getValue();
					break;
				}
			}
		}
		
		if(sessionid == null) {
			sessionid = generateSessionid();
			Cookie c = new Cookie("sessionid", sessionid);
			response.addCookie(c);
		}
		
		
		
		
		
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		out.println("<html>");
		out.println("<body bgcolor = 'green'>");
		out.println("<br>" + "Hello " + "  " + userName + "<br> LOGGED IN!" + "<br>");
		out.println("Your password is : " + "  " + password + "<br>");
		out.println("Il tuo UID is: " + sessionid + "<br>");
	/*	if(userName.equals("luigi")) {
			out.println("<p>Login correct </p>");
			response.sendRedirect("/FirstServletExercise/shoppingPage.html");
		}
		else {
			out.println("<p>Access denied</p>");
			
		} */
		
		String[] choice = request.getParameterValues("option");
		
		for(int i = 0; i < choice.length; i++)
			out.println("<br>"  + choice[i] +  "<br>");
		
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private static String generateSessionid() {
		String uid = new java.rmi.server.UID().toString();
		return java.net.URLEncoder.encode(uid);
	}

}
