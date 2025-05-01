package Veterinaria;

public class DatosMascota {
	private String nombre,especie,raza;
	private int edad;
	
	public DatosMascota(String nombre, String especie, String raza, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.edad = edad;
	}
	
	public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Especie: " + especie + ", Raza: " + raza;
    }
	
	
}
