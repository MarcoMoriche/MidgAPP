package es.loyola.pdm.servelets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/getListadoJuegos")
public class ListadoJuegosServelet extends HttpServlet{

	private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.setContentType("text/plain");
		PrintWriter writer;
		try {
			writer = resp.getWriter();
			for(Juego j: JuegoManager.getJuegos()) {
				writer.write(j.toSrting()+"\n");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
