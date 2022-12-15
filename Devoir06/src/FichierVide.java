import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FichierVide extends Exception {
	
	public FichierVide(String NomFichier) {
		super("Le fichier "+NomFichier+" est vide !");
		
	}


}
