package Veterinaria;

public class DatosC {
	private String nombre,Correo, Dirección;
	private int DNI,telefono;
	
	public DatosC(String nombre, String correo, String dirección) {
		
		this.nombre = nombre;
		this.Correo  = correo;
		this.Dirección = dirección;
		
	}

	public DatosC(int DNI, int telefono) {
		this.DNI = DNI;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
    



	
	
	
	
	
	
	
	
	
	
	
	
	

}
