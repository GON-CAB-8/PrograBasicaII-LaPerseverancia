package ar.edu.unlam.java;

public class EmpleadoPerm extends Empleado {
	private final Double salarioPorHora = 300.0;
	private final Double salarioPorAntiguedad = 100.0;
	private Double salario;
	private Boolean esGerente;

	public EmpleadoPerm(Integer horasTrabajadas, Boolean esposa, Integer hijos, Integer antiguedad, Boolean esGerente) {
		super(horasTrabajadas, esposa, hijos, antiguedad);
		this.esGerente = esGerente;
	}

	public Double getSalarioPorAntiguedad() {
		return salarioPorAntiguedad;
	}

	public Double getSalarioPorHora() {
		return salarioPorHora;
	}

	public Double getSalario() {
		return salario;
	}

	public Boolean getEsGerente() {
		return esGerente;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setEsGerente(Boolean esGerente) {
		this.esGerente = esGerente;
	}

	@Override
	public Double calcularSalario(Integer horas, Boolean esposa, Integer hijos, Integer antiguedad) {
		Double auxSalario = (horas * salarioPorHora) + getSalarioFamiliar() + (antiguedad * getSalarioPorAntiguedad());

		setSalario(auxSalario);

		return auxSalario;
	}

}
