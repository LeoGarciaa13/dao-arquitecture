package com.mayab.desarrollo.logica;

import com.mayab.desarrollo.entities.*;
import com.mayab.desarrollo.persistencia.*;

public class LibroLogica {
	
	public LibroLogica() {
		
	}
	
	public void agregarLibro(Libro libro) {
		
		LibroDAOImp dao = new  LibroDAOImp();
		// Verify the no existence of the book
		dao.createLibro(libro);
	}

}
