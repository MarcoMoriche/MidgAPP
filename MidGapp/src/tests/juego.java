package tests;

import java.util.Objects;

public  class juego implements juegoInterfaz{
	private double valoracion;
	private String nombre, genero, descripcion;
	
	public juego() {}
	
	public juego(String nombre,String genero, String descripcion, double valoracion) {
		super();
		this.nombre=nombre;
		this.genero=genero;
		this.descripcion=descripcion;
		this.valoracion=valoracion;		
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, genero, nombre, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		juego other = (juego) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(valoracion) == Double.doubleToLongBits(other.valoracion);
	}
	
}
