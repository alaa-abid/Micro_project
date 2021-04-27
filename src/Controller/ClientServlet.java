package Controller;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Clients;
import dao.ClientDao;

/**
 * Servlet implementation class Client
 */
@WebServlet()
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClientDao clientdao=new ClientDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//RequestDispatcher dispatcher= request.getRequestDispatcher("/webapp/sinscrire");
		//dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String adresse= request.getParameter("adresse");
		String email= request.getParameter("email");
		String motpasse= request.getParameter("motpasse");
		
		
		Clients client=new Clients();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setEmail(email);
		client.setMotpasse(motpasse);		
		try {
			clientdao.registerClient(client);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher dispatcher= request.getRequestDispatcher("/acceuilSE.jsp");
		dispatcher.forward(request, response);
			//response.sendRedirect("acceuilSE.jsp");
		}
		
		//String url="acceuil1.jsp";
		//request.getRequestDispatcher(url).forward(request, response);
		
		
	}

}
