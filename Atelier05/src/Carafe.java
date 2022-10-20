
public class Carafe  {
	private int contenu, capacite;
	
	public Carafe(int contenu, int capacite) {
		contenu = contenu;
		capacite = capacite;
		
	}
	public void Vider() {
		contenu=0;
	}
	public void Remplir() {
		contenu=capacite;
	}
	public void Transvaser(Carafe c1, Carafe c2) {
		if ((c1.contenu+c2.contenu)<=c2.capacite) {
			c2.contenu=c1.contenu+c2.contenu;
		}else {
			c2.contenu=c2.capacite-c1.contenu;
			c1.contenu=(c2.capacite-c1.contenu);
		}
	}
	public int Contenu() {
		return contenu;
	}
	public int Capacite() {
		return capacite;
	}

}
