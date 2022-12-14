import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Compresse {

	public static void main(String[] args) {

		try {
			File Fichier = new File("Nom.txt");
			FileInputStream Fichier_src = new FileInputStream(Fichier);	
			byte[] buffer= new byte[(int)Fichier.length()];
			Fichier_src.read(buffer);
			Fichier_src.close();
			
	
			FileOutputStream FichierZ = new FileOutputStream(
					new File("Nom.txt.zip"));
			DataOutputStream Fichier_cible = new DataOutputStream(new DeflaterOutputStream(FichierZ));
			
			Fichier_cible.write(buffer);
			Fichier_cible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
