

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Animal
 */
@WebServlet("/Animal")
public class Animal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Animal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Animal").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String list = request.getParameter("radio");
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h1> you chose </h1>");
		
		printWriter.print("<img src='" + animal(list) + "'>");
		
	}
	
	public static String animal(String animal) {
		
		switch (animal) {
		case "dog":
			return "thedog.png";
		case "cat":
			return "thecat.jpg";
		case "donkey":
			return "thedonkey.png";
		case "pig":
			return "thepig.png";
		}
		return animal;
		
		
	}

}
