package modele;

public class Categorie {
	
  public Categorie(String categorie, int refcat) {
		super();
		this.categorie = categorie;
		this.refcat = refcat;
	}
public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getRefcat() {
		return refcat;
	}
	public void setRefcat(int refcat) {
		this.refcat = refcat;
	}
	
	
	
  private String categorie;
  private int refcat;
  
}
