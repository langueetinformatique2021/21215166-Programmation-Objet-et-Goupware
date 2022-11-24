
public abstract class FigureMetrique {

	/** création et gestion d'une figure géométrique */
	protected String couleur = "noir"; // couleur par défaut

	/** création d'une nouvelle instance de FigureMetrique
	* @param co couleur de la figure */
	public FigureMetrique (String co) {
		
	couleur = co; // initialisation de la couleur 
	}

		/**
		 * calcul du périmètre d'une figure géométrique
		 * 
		 * @return double périmètre
		 */
		public abstract double périmètre();

		/**
		 * calcul de la surface d'une figure géométrique
		 * 
		 * @return surface
		 */
		public abstract double surface();
	} // fin de définition de la classe

