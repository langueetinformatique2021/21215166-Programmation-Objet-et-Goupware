import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {


try {
FileInputStreamTP7 FISTP7 = new FileInputStreamTP7("Valeurs.txt");


} catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
}

}
}