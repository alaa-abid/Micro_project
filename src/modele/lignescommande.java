package modele;

public class lignescommande {
	
	
	public lignescommande(int qtecode, int numcommande, int codearticle) {
		super();
		this.qtecode = qtecode;
		this.numcommande = numcommande;
		this.codearticle = codearticle;
	}
	public lignescommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQtecode() {
		return qtecode;
	}
	public void setQtecode(int qtecode) {
		this.qtecode = qtecode;
	}
	public int getNumcommande() {
		return numcommande;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande = numcommande;
	}
	public int getCodearticle() {
		return codearticle;
	}
	public void setCodearticle(int codearticle) {
		this.codearticle = codearticle;
	}
	
	
	
	private int qtecode;
	private int numcommande;
	private int codearticle;

}
