/**
 * 
 */
package it.uiip.esercizio4.individuale;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author Luigi
 * Interfaccia Persistence, che implementa i metodi save e read.
 */
public interface Persistence<T> {
	
	public void save(List<T> list) throws IOException;
	
	public List<T> read() throws FileNotFoundException, IOException, ClassNotFoundException;
	
} 
