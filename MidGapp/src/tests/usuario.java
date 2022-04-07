package tests;

import java.util.Objects;

public  class usuario {
	
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenya;
	
	public usuario() {}
	
	public usuario(String nombre,String apellido, String correo, String contrasenya) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.contrasenya=contrasenya;		
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, contrasenya, correo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		usuario other = (usuario) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(contrasenya, other.contrasenya)
				&& Objects.equals(correo, other.correo) && Objects.equals(nombre, other.nombre);
	}

	
}