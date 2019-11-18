/**
 * Contiene la classe Oppido.java
 */
package it.uiip.w1d1_domanda6;

/**
 * @author pasop
 * Classe che testa Oppido.java
 */
public class OppidoTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oppido oppido = new Oppido("Pasquale", "Oppido");
		
		/**
		 * Test getNome()
		 */
		if("Pasquale".equals(oppido.getNome())) {
			System.out.println("Test getNome(): OK");
		} else {
			System.out.println("Test getNome(): KO");
			System.out.println("expected: Pasquale; actual " + oppido.getNome());
		}
		
		/**
		 * Test getCognome()
		 */
		if("Oppido".equals(oppido.getCognome())) {
			System.out.println("Test getCognome(): OK");
		} else {
			System.out.println("Test getCognome(): KO");
			System.out.println("expected: Oppido; actual " + oppido.getCognome());
		}
		
		/**
		 * Test toString()
		 */
		if("Oppido [nome=Pasquale, cognome=Oppido]".equals(oppido.toString())) {
			System.out.println("Test toString(): OK");
		} else {
			System.out.println("Test toString(): KO");
			System.out.println("expected: Oppido [nome=Pasquale, cognome=Oppido]; actual " + oppido.toString());
		}

	}

}
