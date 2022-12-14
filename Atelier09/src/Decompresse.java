import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Decompresse {

	public static void main(String[] args) {

			try {
				FileInputStream fin = new FileInputStream(
						new File("Nom.txt.zip"));
				DataInputStream fsource = new DataInputStream(new InflaterInputStream(fin));
				FileOutputStream fcible = new FileOutputStream(
						new File("NomD.txt"));

				int tmp;
				while ((tmp = fsource.read()) != -1) {
					fcible.write(tmp);

				}
				
				fsource.close();
				fcible.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
