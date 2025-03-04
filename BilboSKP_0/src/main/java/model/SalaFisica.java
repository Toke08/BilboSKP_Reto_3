package model;

import java.util.HashMap;

public class SalaFisica extends Sala{
	private String direccion;
	private int telefono;
	//este hashmap contendrá todas las salas fisicas disponibles
	private static HashMap<String, Sala> salasFisicasCargadas = new HashMap<String, Sala>();
	
	public SalaFisica(String idSala, String nombre, String dificultad, String tematica, String descripcion,
			int tiempoMax, int jugadoresMin, int jugadoresMax, int edadRecomendada, String direccion, int telefono) {
		super(idSala, nombre, dificultad, tematica, descripcion, tiempoMax, jugadoresMin, jugadoresMax,
				edadRecomendada);
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public static void setSalasCargadas(HashMap<String, Sala> salasCargadas) {
		salasFisicasCargadas = salasCargadas;
	}
	public static HashMap<String, Sala> getSalasCargadas() {
		return salasFisicasCargadas;
	}
	public static void clearSalasCargadas() {
		salasFisicasCargadas.clear();
	}
}
