import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

/**
 * 
 * @author 21215166
 */
public class FileInputStreamTP7 extends FileInputStream {
	private File fichier;
	private String nomFichier;
	
	/**
	 * Création d'une nouvelle instance de FileInputStreamTP7
	 * 
	 * @param fichier le fichier 
	 * @param nomFichier le nom du fichier
	 */
	public FileInputStreamTP7(String nomFichier) throws FileNotFoundException {
		super(nomFichier);
		this.fichier = new File(nomFichier);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Définition de la méthode Copie qui prend en paramètre un attribut de type File représentant le 
	 * fichier de destionation
	 * 
	 * @param Fichier_dest fichier cible
	 * @throws IOException
	 */
	public void Copie (File Fichier_dest) throws IOException {
		try {


			FileInputStream Fichier = new FileInputStream(fichier);	

			byte[] buffer= new byte[(int)fichier.length()];
			Fichier.read(buffer);
			Fichier.close();
			
			FileOutputStream FichierO = new FileOutputStream(Fichier_dest);
			FichierO.write(buffer);
			FichierO.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Affiche les différentes propriétés d'un fichier
	 */	
public void Propietes () {
	System.out.println("Le nom du fichier est : "+fichier.getName());
	System.out.println("Le chemin absolu du fichier est : "+fichier.getAbsolutePath());
	System.out.println("Le chemin du fichier : "+fichier.getPath());
	System.out.println("La classe du fichier est : "+fichier.getClass());
	System.out.println("La taille du fichier est : "+fichier.length());
	System.out.println("L'espace total du fichier est : "+fichier.getTotalSpace());


	
}
	
	

}
