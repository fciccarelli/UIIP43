/**
 * 
 */
package it.uiip.esercizio4.individuale;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luigi
 *
 */
public class TestDefaultPersonPersistence {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		
		Persona pers1 = new Persona("Luigi", "Scialpi", 29);
		Persona pers2 = new Persona("Marco", "Filieri", 26);
		Persona pers3 = new Persona("Antonio", "Marra", 36);
		
		List<Persona> list = new ArrayList<Persona>();
		
		list.add(pers1);
		list.add(pers2);
		list.add(pers3);
		
		/**
		 * Scrivo su file una Persona alla volta
		 */
		DefaultPersonPersistence inStampa = new DefaultPersonPersistence();
		
		try {
			inStampa.save(list);
			System.out.println("Test Stampa OK");
		} catch (IOException e){
			e.printStackTrace();	    
		}
		
		/**
		 * Leggo da file una Persona alla volta
		 */
		DefaultPersonPersistence  inLettura = new DefaultPersonPersistence();
		
		try {
			inLettura.read();
			System.out.println("Test Lettura OK");
		} catch (IOException e) {
			e.printStackTrace();	    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	    
		} 
		
		/**
		 * Confronto tra lista di Persona passato al metodo save e quello creato da read
		 */
		try {
			System.out.println("Test confronto OK: " + list.equals(inLettura.read()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
