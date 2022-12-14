import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copie {

	public static void main(String[] args) {
		try {
			File Fichier = new File("Nom.txt");
			FileInputStream Fichier_src = new FileInputStream(Fichier);	
			
			byte[] buffer= new byte[(int)Fichier.length()];
			Fichier_src.read(buffer);
			Fichier_src.close();
			
			FileOutputStream Fichier_dest = new FileOutputStream(
					new File("NomC.txt"));
			Fichier_dest.write(buffer);
			Fichier_dest.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
