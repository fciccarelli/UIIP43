package com.mkyong.core;

import org.springframework.beans.factory.annotation.Required;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	private Persona persona;
	private CaratteristicheFisiche caratteristicheFisiche;
	

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
		System.out.println("Spring 3 : Hello ! " + persona.getNome() + " " + persona.getCognome());
		System.out.println("Spring 3 : Hello ! " + caratteristicheFisiche.getAltezza() + " " +caratteristicheFisiche.getPeso() +  " " + caratteristicheFisiche.getColoreCapelli() );
		
	
		
	}

	public Persona getPersona() {
		return persona;
	}

	@Required
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public CaratteristicheFisiche getCaratteristicheFisiche() {
		return caratteristicheFisiche;
	}
	
@Required
	public void setCaratteristicheFisiche(CaratteristicheFisiche caratteristicheFisiche) {
		this.caratteristicheFisiche = caratteristicheFisiche;
	}
	
	
	
}