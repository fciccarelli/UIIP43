/**
 * 
 */
package it.uiip.esercizio4.individuale;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luigi
 * Classe che implementa l'interfaccia Persistence ed ha i metodi di salvataggio su file un oggetto per volta
 *  e lettura di un oggetto da file un oggetto per volta.
 */
public class DefaultPersonPersistence implements Persistence<Persona> {
	
	private String filePath = "C://data//people.dat";
	
	/**
	 * Metodo che implementa il salvataggio su file di un oggetto Persona uno alla volta; il parametro in ingresso
	 * è l'ArrayList contenente Persona.
	 */
	public void save(List<Persona> list) throws IOException {
		
		ObjectOutputStream scrivi = null;
		
			try {
				scrivi = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
				for (int i=0; i<list.size(); i++) {
					scrivi.writeObject(list.get(i));
				}	
			} finally {
				scrivi.close();
			}

		}
	
	/**
	 * Metodo che implementa la lettura da file di un oggetto Persona uno alla volta; restituisce un ArrayList
	 * contenente oggetti di tipo Persona letti dal file.
	 */
	public List<Persona> read() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream input = null;
		List<Persona> letti = new ArrayList<Persona>();
		
		try {

			input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
			
			Persona pRead;
			
			try {
				while (true) {
					pRead = (Persona) input.readObject();
					letti.add(pRead);
				}
			} catch (EOFException e) {
			}
		} finally {
			input.close();
		}
		return letti;
	}
	
	
}

