package ar.edu.unlam.java;

import java.util.List;

public class Empresa {
	
	private String cuit;
	private String razonSocial;
	private List<Empleado> listaEmpleados;
	private Double salario;
	
	
	public Empresa(String cuit, String razonSocial, List<Empleado> listaEmpleados) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.listaEmpleados = listaEmpleados;
	}


	public String getCuit() {
		return cuit;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}


	public Double getSalario() {
		return salario;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Double calcularSalarioTotal() {
		Double auxSalarios = 0.0;
		
		for (Empleado empleado : listaEmpleados) {
			auxSalarios += empleado.calcularSalario(empleado.getHorasTrabajadas(), empleado.getEsposa(), empleado.getHijos(), empleado.getAntiguedad());
		}
		
		return auxSalarios;
	}
	
	
	

	

}
