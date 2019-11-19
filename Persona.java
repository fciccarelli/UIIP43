/**
 * 
 */
package it.uiip.esercizio4.individuale;

import java.io.Serializable;

/**
 * @author Luigi
 * Classe che definisce l'oggetto Persona ed implementa l'interfaccia Serializable.
 */
public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	
	private String nome;
	private String cognome;
	private int eta;
	
	/**
	 * Costruttore dell'oggetto Persona.
	 * @param nome è il nome della persona.
	 * @param cognome è il cognome della persona.
	 * @param eta è l'età della persona.
	 */
	public Persona(String nome, String cognome, int eta) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return eta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + eta;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (eta != other.eta)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	/**
	 * Costruttore di copia.
	 * @param p oggetto del quale si vuole fare la copia. 
	 */
	public Persona (Persona p) {
		this.nome = p.nome;
		this.cognome = p.cognome;
		this.eta = p.eta;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
}
