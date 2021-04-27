package Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
//import javax.persistence.GenerationType;


@Entity
@NamedQuery(query = "Select e from article e where e.categorie = :categorie")
public class Articles {
	
	
	public Articles(int codearticle, int prix, int stock, String categorie, String designation) {
		super();
		this.codearticle = codearticle;
		this.prix = prix;
		this.stock = stock;
		this.categorie = categorie;
		this.designation = designation;
	}
	public Articles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodearticle() {
		return codearticle;
	}
	public void setCodearticle(int codearticle) {
		this.codearticle = codearticle;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
	public Articles(int prix, int stock) {
		super();
		this.prix = prix;
		this.stock = stock;
	}





	public Articles(int codearticle, int prix, int stock , String designation) {
		super();
		this.codearticle = codearticle;
		this.prix = prix;
		this.stock = stock;
		this.designation=designation;
	}




    @Id
	private int codearticle;
	private int prix;
	private int stock;
	private String categorie;
	private String designation;
	

}
