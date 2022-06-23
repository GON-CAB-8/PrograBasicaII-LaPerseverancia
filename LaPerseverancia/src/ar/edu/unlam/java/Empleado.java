package ar.edu.unlam.java;

public abstract class Empleado {
	private Integer horasTrabajadas;
	private Double salarioFamiliar;
	private Boolean esposa;
	private Integer hijos;
	private Integer antiguedad;
	private final Double salarioPorEsposa = 100.0;
	private final Double salarioPorHijo = 200.0;

	public Empleado(Integer horasTrabajadas, Boolean esposa, Integer hijos, Integer antiguedad) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.setEsposa(esposa);
		this.setHijos(hijos);
		this.setAntiguedad(antiguedad);
		calcularSalarioFamiliar(esposa, hijos);
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public Double getSalarioFamiliar() {
		return salarioFamiliar;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setSalarioFamiliar(Double salarioFamiliar) {
		this.salarioFamiliar = salarioFamiliar;
	}

	public Boolean getEsposa() {
		return esposa;
	}

	public void setEsposa(Boolean esposa) {
		this.esposa = esposa;
	}

	public Integer getHijos() {
		return hijos;
	}

	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void calcularSalarioFamiliar(Boolean esposa, Integer hijos) {
		Double auxSalaFamiliar = 0.0;
		if (esposa) {
			auxSalaFamiliar = (salarioPorEsposa + (salarioPorHijo * hijos));
		} else {
			auxSalaFamiliar = (salarioPorHijo * hijos);
		}

		setSalarioFamiliar(auxSalaFamiliar);
	}

	public abstract Double calcularSalario(Integer horas, Boolean esposa, Integer hijos, Integer antiguedad);

}
