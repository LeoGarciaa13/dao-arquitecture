package com.mayab.desarrollo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import com.mayab.desarrollo.entities.Libro;

public class LibroDAOImp implements ILibrosDAO{
	//private ArrayList<Libro> lista;
	private static final String DRIVER_NAME = "com.sqlite.jdbc.Driver";
	private static final String DB_URL = "jdbc:sqlite:C:\\Users\\Martin Garcia Nava\\OneDrive - AG-ALL TI S DE RL DE CV\\Leo\\Anahuac 6to Semestre\\Desarrollo Software\\libreria.db";
	private static final String ID = "";
	private static final String PASS = "";
	
	
	// Constructor
	public LibroDAOImp(){
		
	}
	
	
	// DRIVER METHODS
	private Connection getConnection(){
		try {
			System.out.println("Connecting to database...");
			return DriverManager.getConnection(DB_URL, ID, PASS); 
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	private static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	// IMPLEMENTATION
	@Override
	public boolean createLibro(Libro libro) {
		//
		Connection con = null; 
		PreparedStatement stmt = null;
		boolean resBool = false; 
		
		try {
			con = getConnection();
			stmt = con.prepareStatement("INSERT INTO libros(nombre, isbn) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, libro.getNombre());
			stmt.setString(2, libro.getIsbn());
			
			int result = stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			
			if(rs.next()) {
				libro.setId(rs.getInt(1));
				resBool = true;
				System.out.println("Added with success....");
				
			}
		}catch(SQLException e) {
				throw new RuntimeException(e);
				
		}finally {
			close(con);
		}
		return resBool;
	}
	
	
	@Override
	public ArrayList<Libro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro findByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean deleteLibro(Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}


}
