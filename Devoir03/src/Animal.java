
/**
 * @author 21215166
 * */


public abstract class Animal {
	private String classe;
	protected String mode_alimentation;
	
	   /** 
     * Constructeur de la classe Animal
     * 
     * 
     * @param classe
     *     Représente la classe de l'animal
     * @param mode_alimentation
     *     Définit si l'animal est carnivore, herbivore, ou omnivore.
     */ 
	
  public  Animal(String classe, String alimentation) {
	this.classe=classe;
	mode_alimentation=alimentation;
}

  /**
   * Description de l'animal*/
public void SeDecrit() {
	 System.out.println("Je suis un animal "+mode_alimentation+" de la classe  des " +classe);
	 }

/**
 * Ce que mange l'animal*/
public abstract void Mange();
	

}
