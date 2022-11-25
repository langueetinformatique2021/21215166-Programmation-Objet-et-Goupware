

/** Générateur de nombres entiers naturels aléatoires
 * @author Sarah
 */
public class Aleat {
	private int maximum;
	
	/** instanciation 
	 * @param maximum nombre maximum généré */
	public Aleat(int maximum) {
		this.maximum = maximum;
	}

	/** @return Nombre aléatoire*/
	public int get() {
		return (int)(Math.random() * maximum) + 1;
	}
}

