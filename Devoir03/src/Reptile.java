
public class Reptile extends Animal{

	public Reptile(String alimentation, String espèce) {
		super("réptiles", alimentation);
		espèce=espèce;
	}
	/** Description du réptile */
	public void SeDecrit() {
		//On appelle la méthode de la classe mère "Animal"
		super.SeDecrit();
	}

	@Override
	public void Mange() {
		System.out.println("Je suis "+mode_alimentation);

		
	}
	

}
