/**
 * 
 */
package com.zoamz.projectwebservices.entity;

import java.time.LocalDateTime;

/**
 * @author Zoamz
 *
 */
public class Empleado {
	private String numeroEmpleado;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private int edad;
	private LocalDateTime fechaCreacion;
	
	
	/**
	 * @return the numeroEmpleado
	 */
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}
	/**
	 * @param numeroEmpleado the numeroEmpleado to set
	 */
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the primer_apellido
	 */
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	/**
	 * @param primer_apellido the primer_apellido to set
	 */
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	/**
	 * @return the segundo_apellido
	 */
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	/**
	 * @param segundo_apellido the segundo_apellido to set
	 */
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
