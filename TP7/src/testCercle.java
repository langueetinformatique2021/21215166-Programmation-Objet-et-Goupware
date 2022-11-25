
public class testCercle {

	public static void main(String[] args) {
		Cercle c = new Cercle("Rouge", 3.5);
		c.périmètre();
		c.surface();
		System.out.println("Le périmètre du cercle = "+c.périmètre()+
				"\nLa superficie du cercle est égale à :"+c.surface());

		

	}

}
