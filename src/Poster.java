

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Poster
 */
@WebServlet("/Poster")
public class Poster extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Poster() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: List").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String list = request.getParameter("list");
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<p> testar " + list + "</p>");
		
		ArrayList<String> words = new ArrayList<>();
		String delimiters = "\\s+|,\\s*|\\.\\s*";
		
		for(String s : list.split(delimiters)) {
			words.add(s);
		}
		
		printWriter.print("<ol>");
		
		for(String w : words) {
			printWriter.print("<li>" + w + "</li>" );
		}
		
		printWriter.print("</ol>"); // jag skapade inte en extra metod här för att jag inte ville! :P
		
	}
	
	
		
	}


