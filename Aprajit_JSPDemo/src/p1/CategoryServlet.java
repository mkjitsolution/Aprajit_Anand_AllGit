package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String course = request.getParameter("course") ;
		try {
			List<String> listtrainerNames = new DatabaseClass().getTrainerByCourse(course);
			
					
			/*
			response.sendRedirect("TrainerNamePage.jsp"); // bcoz this not a solution
			
			  // above code will not be useful as it generates new req and resp object
			  // in order to forward  req to next page -> use RequestDispatcher
			
			*/
			
			// adding data to request scope
			request.setAttribute("trainers", listtrainerNames);
			
			// moving same request to next page
			RequestDispatcher rd = request.getRequestDispatcher("TrainerNamePage.jsp");
			rd.forward(request, response);
			
			
			
						
		} catch (Exception e) {
			// TODO: handle exception
			// //Print on Console 
			System.out.println(e.getMessage());
			
			// print on browser shortcut
			response.getWriter().append(e.getMessage()); /// temporary PrintWriter
			
			// print on browser actual code
			PrintWriter out = response.getWriter();
			out.print(e.getMessage());
		
			
		}
		
	}

}


/*ServletContext applicationScope = getServletContext();
 * applicationScope.setAttribute("trainer_xyz", listtrainerNames);
			
 * // for sesssion
			
			HttpSession session = request.getSession(true);
			session.setAttribute("trainers_xyzann", listtrainerNames);
 * */
