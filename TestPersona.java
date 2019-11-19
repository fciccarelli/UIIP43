/**
 * 
 */
package it.uiip.esercizio4.individuale;

/**
 * @author Luigi
 *
 */
public class TestPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona pers1 = new Persona("Luigi", "Scialpi", 29);
		Persona pers2 = new Persona("Luigi", "Scialpi", 29);
		Persona pers3 = new Persona("Antonio", "Marra", 36);
		
		/**
		 * Test getNome
		 */
		System.out.println("Test getNome OK: " + pers1.getNome());
		
		/**
		 * Test toString
		 */
		System.out.println("Test toString OK: " + pers1.toString());
		
		/**
		 * Test hashCode
		 */
		if (pers1.hashCode() == pers2.hashCode()) {
			System.out.println("Test hashCode OK");
		} else System.out.println("Test hashCode KO");
		
		/**
		 * Test equals
		 */
		if (pers1.equals(pers2)) {
			System.out.println("Test equals OK");
		} else System.out.println("Test equals KO: " + pers1.equals(pers2));
		
		/**
		 * Test !equals
		 */
		if (pers1.equals(pers3)) {
			System.out.println("Test !equals KO: " + pers1.equals(pers3));
		} else System.out.println("Test !equals OK");
		
		/**
		 * Test costruttore di copia
		 */
		Persona pers10 = new Persona(pers1);
		System.out.println(pers10);
		
		
	}

}
