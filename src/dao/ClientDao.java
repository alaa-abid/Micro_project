package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Models.Clients;


public class ClientDao {
	/* int resultat = 0;
	 public  int registerClient (Clients client) throws ClassNotFoundException {
		 String INSERT_USERS_SQL ="INSERT INTO clients" +"(nom,prenom,email,adresse,motpasse) values" +"(?,?,?,?,?);";				 		 		 						
		try {		Class.forName("com.mysql.cj.jdbc.Driver");	 
					
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
				PreparedStatement  pstat = connection.prepareStatement(INSERT_USERS_SQL);
						//pstat.setInt(1, 1);
						pstat.setString(1 , Clients.getNom());
						pstat.setString(2, Clients.getPrenom());
						pstat.setString(3, Clients.getAdresse());
						pstat.setString(4, Clients.getEmail());
						pstat.setString(5, Clients.getMotpasse());											
					System.out.println(pstat);					
					resultat=pstat.executeUpdate();																																					 
		 }catch (SQLException E) { 		
		 E.printStackTrace();		 
		 }
		 return resultat;		 
	 }
	 public boolean validate(Clients client) throws ClassNotFoundException {
	        boolean status = false;

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

	            // Step 2:Create a statement using connection object
	            PreparedStatement pstat = connection
	            .prepareStatement("select * from clients where email = ? and motpasse = ? ")) {
	            pstat.setString(1, client.getEmail());
	            pstat.setString(2, client.getMotpasse());

	            System.out.println(pstat);
	            ResultSet rs = pstat.executeQuery();
	            status = rs.next();

	        } catch (SQLException e) {
	            // process sql exception
	        	e.printStackTrace();
	        }
	        return status;
	    }*/
	public static void main( String[ ] args ) 
	{
		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory( "Micro_Project2" );
		EntityManager entitymanager = emfactory.
				createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		Clients clt = new Clients( ); 
		
		clt.setNom( "" );
		clt.setAdresse("");
		clt.setPrenom( "" );
		clt.setEmail("");
		clt.setMotpasse("");
		entitymanager.persist( clt );
		entitymanager.getTransaction( ).commit( );
		
		entitymanager.close( );
		emfactory.close( );
		}

}
