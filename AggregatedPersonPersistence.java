/**
 * 
 */
package it.uiip.esercizio4.individuale;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luigi
 * Classe che implementa l'interfaccia Persistence ed ha i metodi di salvataggio su file di una lista contenente
 * oggetti di tipo Persona e lettura da file di oggetti di tipo Persona.
 */
public class AggregatedPersonPersistence implements Persistence<Persona> {
	
	private String filePath = "C://data//people-grouped.dat";

	/**
	 * Metodo che implementa il salvataggio su file di una lista di oggetti; il parametro in ingresso
	 * è l'ArrayList contenente oggetti di tipo Persona.
	 */
	public void save(List<Persona> list) throws IOException {
		
		ObjectOutputStream scrivi = null;
		
		try {
			scrivi = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
			scrivi.writeObject(list);
		} finally {
			scrivi.close();
		}
	}
	
	/**
	 * Metodo che implementa la lettura da file di uno stream; restituisce un ArrayList
	 * contenente oggetti di tipo Persona letti dal file.
	 */
	@SuppressWarnings("unchecked")
	public List<Persona> read() throws IOException, ClassNotFoundException {
		
		ObjectInputStream input = null;
		List<Persona> letti = new ArrayList<Persona>();
		
		try {
			input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
			
			letti = (List<Persona>) input.readObject();

		} finally {
			input.close();
		}
		return letti;
	}

}

