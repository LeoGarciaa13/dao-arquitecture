package com.mayab.desarrollo.dao;

import com.mayab.desarrollo.entities.*;
import com.mayab.desarrollo.logica.*;

public class App 
{
    public static void main( String[] args )
    {
        // MAIN VIEW
    	Libro lib = new Libro("Fundacion", "8261");
    	LibroLogica logica = new LibroLogica();
    	
    	// Add the book by the logic
    	logica.agregarLibro(lib);
    }
}
