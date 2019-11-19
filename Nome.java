/**
 * Contiene la classe Oppido.java
 */
package it.uiip.w1d1_domanda6;

/**
 * @author pasop
 * Consente di stampare nome e cognome di Pasquale Oppido
 */
public class Nome {

	private String nome;
	private String cognome;
	
	/**
	 * Costruttore vuoto
	 */
	public Nome () {
		this("","");
	}
	
	/** 
	 * Inizializza un oggetto Oppido con un nome e cognome
	 * @param nome rappresenta il nome
	 * @param cognome rappresenta il cognome
	 * un oggetto con un dato nome e cognome viene inizializzato
	 */
	public Oppido(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	/**
	 * restituisce il nome
	 * @return the nome
	 * la variabile nome non viene modificata
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * restituisce il cognome
	 * @return the cognome
	 * la variabile cognome non viene modificata
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Override del metodo toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	
	
}
