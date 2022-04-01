package com.mayab.desarrollo.persistencia;

import com.mayab.desarrollo.entities.*;
import java.util.ArrayList;

public interface ILibrosDAO {
	
	// Library App
	
	public Libro findByISBN(String isbn);
	public boolean createLibro(Libro libro); 
	public boolean deleteLibro(Libro libro); 
	public ArrayList<Libro> findAll();

}
