package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modele.Articles;

public class ArticleDao {
	static Connection connection= null;
	public static void connect() throws SQLException {
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }                                                           
    }
	 
	
	public static  List<Articles> ListAllArticles() throws SQLException {
		 List<Articles> listArticle = new ArrayList<>();
		 
	       
		 
		 String SQL_ARTICLE="SELECT prix,codearticle,stock,designation from articles ";
	        		
		 connect();
		 
		 Statement statement = connection.createStatement();
	     ResultSet resultSet = statement.executeQuery(SQL_ARTICLE);
	     
	     while (resultSet.next()) {
	    	 
	            int id = resultSet.getInt("codearticle");	            
	            int stock = resultSet.getInt("stock");
	            int prix = resultSet.getInt("prix");
	            String designation= resultSet.getString("designation");
	             
	            Articles article = new Articles(id,stock,prix,designation);
	            listArticle.add(article);
	        }
	        
		return listArticle;
		
	}
	 public Articles getArticle(int Codearticle) throws SQLException {
	        Articles article = null;
	        String sql = "SELECT * FROM articles WHERE codearticle = ?";
	         
	        connect();
	         
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, Codearticle);
	         
	        ResultSet resultSet = statement.executeQuery();
	         
	        if (resultSet.next()) {
	           
	            int stock = resultSet.getInt("stock");
	            int prix = resultSet.getInt("prix");
	             
	            article = new Articles(prix, stock);
	        }
	         
	        resultSet.close();
	        statement.close();
	         
	        return article;
	    }

}
