import java.io.*;
import java.util.*;

/**
 * Lecture des mots d'un fichier-texte
 * 
 * @author 21215166
 */
public class LireTexte {
	private String NomFichier;
	private BufferedReader entrée;
	private String ligne;
	private StringTokenizer tok;

	/**
	 * Création d'une nouvelle instance de LireTexte
	 * 
	 * @param ft nom du fichier texte
	 */
	public LireTexte(String NomFichier) {
		this.NomFichier = NomFichier;
	}

	/**
	 * Ouverture d'un fichier texte, Lecture de la première ligne, Teste si le
	 * fichier est vide
	 * 
	 * @throws IOException Erreur à l'ouverture
	 * @throws FichierVide Fichier vide
	 */
	protected void Ouvrir() throws IOException, FichierVide {
		try {
			BufferedReader Fichier = new BufferedReader(new FileReader(new File(NomFichier)));

			if (Fichier.readLine() == null) {
				throw new FichierVide(NomFichier);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Fermeture du fichier
	 * 
	 * IOException Erreur à la fermeture
	 */
	protected void Fermer() throws IOException {
		try {
			BufferedReader Fichier = new BufferedReader(new FileReader(new File(NomFichier)));
			Fichier.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Lecture mot à mot du fichier
	 * 
	 * @return prochain mot
	 * @throws IOException Erreur de lecture
	 */

	public String readWord() throws IOException {

		try {
			BufferedReader Fichier = new BufferedReader(new FileReader(new File(NomFichier)));
			ligne = Fichier.readLine();
			
			if (ligne != null) {
				tok = new StringTokenizer(ligne);
				if (tok.hasMoreTokens()) {
					return tok.nextToken();
				} 
			}
			return null;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		

	}

}
