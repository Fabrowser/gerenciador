package gerenciador;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class HelloFormPost

@WebServlet("/HelloFormPost")

public class HelloFormPost extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloFormPost() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			String title = "Usando método GET Chamado pelo POST";
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + 
							 "transitional//en\">\n";
			
			
					out.println(docType + 
					"<html>\n"+	
					"<head><title>" + title + "</title></head>\n" + 
					"<body bgcolor = \"#f0f0f0\">\n" + 
					"<h1 align = \"center\">" + title + "</h1>\n" + 
					"<ul>\n"+
					" <li><b>First Name</b>:"
					+ request.getParameter("first_name") + "\n" + 
					" <li><b>Last  Name</b>:" + 
					request.getParameter("last_name") + "\n" +
					"</ul>\n"+
					"</body>"+
					"</html>"			
					);				
			}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		doGet(request, response);
	}
	
}
