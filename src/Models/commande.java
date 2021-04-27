package Models;

import java.util.Date;


public class commande {
	
       public commande(int codeclient, int numcommande) {
		super();
		this.codeclient = codeclient;
		this.numcommande = numcommande;
	}
	public commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodeclient() {
		return codeclient;
	}
	public void setCodeclient(int codeclient) {
		this.codeclient = codeclient;
	}
	public int getNumcommande() {
		return numcommande;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande = numcommande;
	}
	
	
	
	   private int codeclient;
       private int numcommande;
       private Date datecommande;
}
