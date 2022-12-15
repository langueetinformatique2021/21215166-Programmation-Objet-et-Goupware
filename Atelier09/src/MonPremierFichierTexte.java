import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexte {
	
	public static boolean Verifier() {
		try {
			BufferedReader Lect = new BufferedReader(
					new FileReader(new File("Nom.txt")));
			
			
			if (Lect.readLine().equals("21215166") == false)
				return false;
			if (Lect.readLine().equals("21223344") == false)
				return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {

		try {
			PrintWriter Fichier = new PrintWriter(new File("Nom.txt"));
			Fichier.println("21215166");
			Fichier.println("21223344");
			Fichier.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Verifier());

	}

}