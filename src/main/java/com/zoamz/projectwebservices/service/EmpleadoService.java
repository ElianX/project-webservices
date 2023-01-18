/**
 * 
 */
package com.zoamz.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.zoamz.projectwebservices.entity.Empleado;

/**
 * @author Zoamz
 *
 */
public class EmpleadoService {
	
	/**
	 * Método que permite consultar un empleado por su id
	 * @param numeroEmpleado {@link String} múmero del empleado.
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();

		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}
		return  null;
	}

	/**
	 * Método pa simular la consulta de un empleado
	 * 
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("23423");
		empleado.setNombre("Juan");
		empleado.setPrimer_apellido("Torres");
		empleado.setSegundo_apellido("Pinzón");
		empleado.setEdad(23);
		empleado.setFechaCreacion(LocalDateTime.now());

		return empleado;
	}

	/**
	 * Método que permite consultar la lista de empleados
	 * 
	 * @return {@list List} lista consultada
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("23423");
		empleado.setNombre("Juan");
		empleado.setPrimer_apellido("Torres");
		empleado.setSegundo_apellido("Pinzón");
		empleado.setEdad(23);
		empleado.setFechaCreacion(LocalDateTime.now());

		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNumeroEmpleado("13233");
		empleadoNuevo.setNombre("Erika");
		empleadoNuevo.setPrimer_apellido("Guerra");
		empleadoNuevo.setSegundo_apellido("Gónzales");
		empleadoNuevo.setEdad(32);
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());

		empleados.add(empleadoNuevo);
		empleados.add(empleado);

		return empleados;
	}

}
