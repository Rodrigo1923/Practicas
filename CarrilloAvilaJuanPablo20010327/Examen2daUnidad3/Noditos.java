package MemoriaDinamica;

public class Noditos<T> {

	public T info;
	public Noditos sig;
	private String nombre;
	private String apellido;
	private int edad;
	private String folio;
	private String correo;
	
	public Noditos(String nombre, String apellido, int edad, String correo, String folio) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.folio=folio;
		this.correo=correo;
		this.sig = null;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	
	public Noditos getSig() {
		return sig;
	}

	public void setSig(Noditos sig) {
		this.sig = sig;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
