package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password= request.getParameter("password");
		
		/*
		 * Validate data using database
		 * if true then valid
		 * else invalid
		 * 
		 * */
		
		if(username.equals("aprajit")&&password.equals("123"))
		{
			// valid user
			// create new session
			
			HttpSession session = request.getSession(true);
			// use true in case of creation of new session
			//  which is similar to getSession()
			// New Session Created which attributes null
			
			session.setAttribute("user-name", username);
			response.sendRedirect("Page2.jsp");
			
			
		}
		else
		{
			// invalid - user
			
		}
		
	}

}
