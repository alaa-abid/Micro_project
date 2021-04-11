package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClientDao;
import modele.Clients;

/**
 * Servlet implementation class Client2Servlet
 */
@WebServlet("/Client2Servlet")
public class Client2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ClientDao cltdao=new ClientDao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Client2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		  String email = request.getParameter("email");
	        String motpasse = request.getParameter("motpasse");
	        Clients clt = new Clients();
	        clt.setEmail(email);
	        clt.setMotpasse(motpasse);
	        try {
	            if (cltdao.validate(clt)) {
	                //HttpSession session = request.getSession();
	                // session.setAttribute("",);
	                response.sendRedirect("acceuilSE");
	            } else {
	                HttpSession session = request.getSession();
	                //session.setAttribute("", );
	                //response.sendRedirect("");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }	
}
