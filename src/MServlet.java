import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	String n=request.getParameter("name");
	String p=request.getParameter("pass");
		
	if(n==null){
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	else if(n.equals("1")&&p.equals("1")){
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}
	else{
		request.setAttribute("error","true");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);

	}
	
	
	out.close();
	}

}
