package gerenciador;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


//oi
@WebServlet(urlPatterns="/oi")

public class OlaMundoServlet extends HttpServlet {
	
	@Override	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Olá Mundo! Escrevemos nosso primeiro ServLet!");
		out.println("<table>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>Header content 1</th>");
		out.println("<th>Header content 2</th>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tfoot");
		out.println("<tr>");
		out.println("<td> Footer content 1</td>");
		out.println("<td> Footer content 2</td>");
		out.println("</tr>");
		out.println("</tfoot");
		out.println("<tbody");
		out.println("<tr>");
		out.println("<td> Fabricio</td>");
		out.println("<td> Guimarães</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Bruna</td>");
		out.println("<td> Helena</td>");
		out.println("</tr>");
		out.println("</tbody");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		

		System.out.println("O Servlet OlaMundoServlet foi chamado");	
			
	}
	

}
