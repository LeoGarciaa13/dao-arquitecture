package com.mayab.desarrollo.entities;

public class Libro {
	
	private int id; 
	private String isbn; 
	private String nombre;
	
	public Libro( String nombre, String isbn) {
		this.isbn = isbn; 
		this.nombre = nombre; 
	}
	
	
	
	// GETTERS & SETTERS
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 

}
