

import java.math.*; //importation du package math 

/**@author 21215166*/

/** Dérivée de FigureMetrique implémentant l'interface Comparable, les nouveaux attributs rayon et Pi 
 * et la méthode compareTo de Comparable
 *  Redéfinissant des méthodes Périmètre() et Surface() */
public class Cercle extends FigureMetrique implements Comparable{
	
private double rayon;
final double PI=Math.PI; 

/** Constructeur de Cecle
* @param co couleur du cercle (paramètre hérité de la superclasse)
* @param rayon rayon du cercle*/
	public Cercle(String co, double rayon) {
		super(co);
		this.rayon=rayon;
	}

	/** Méthode de l'interface Comparable
	* @param Cercle  (prend un objet Cercle)
	* @return entier positif, négatif, ou nul*/
	@Override
	public int compareTo(Object Cercle) {
		return 0;
	}
	/** Méthode qui calcule le périmètre du cercle
	* @return le périmètre du cercle */
	@Override
	public double périmètre() {
		double p=2*PI*rayon; // Calcul du périmètre d'un cercle
		return Math.round(p * 100.0)/100.0; //Arrondir le résultat
	}
	/** Méthode qui calcule le superficie du cercle
	* @return la superficie du cercle */
	@Override
	public double surface() {
		double s=rayon*rayon*PI; // Calcul de la superficie d'un cercle
		return Math.round(s * 100.0)/100.0; // Arrondi le résultat
	}

}
