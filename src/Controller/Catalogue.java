package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Articles;
import dao.ArticleDao;

/**
 * Servlet implementation class Catalogue
 */
@WebServlet()
public class Catalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ArticleDao articledao=new ArticleDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		 try {
			 listArticle(request, response);
		 } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		 
	}
	private void listArticle(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Articles> listArticle = ArticleDao.ListAllArticles();
        request.setAttribute("listArticle", listArticle);
        RequestDispatcher dispatcher = request.getRequestDispatcher("catalogue.jsp");
        dispatcher.forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
