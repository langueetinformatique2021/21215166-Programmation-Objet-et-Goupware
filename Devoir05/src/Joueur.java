
public class Joueur {
	private String nom;
	private int nbJetons=0;
	public Joueur (String nom) {
		this.nom=nom;
		
		
	}
	public int getNbJetons() {
		return nbJetons;
	}
	public void setNbJetons(int nbJetons) {
		this.nbJetons = nbJetons;
	}
	public String getNom() {
		return nom;
	}
 
}
