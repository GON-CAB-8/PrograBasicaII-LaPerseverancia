package ar.edu.unlam.java;

public class Gerente extends EmpleadoPerm {

	private final Double salarioPorHora = 400.0;
	private final Double salarioPorAntiguedad = 150.0;
	private Double salario;

	public Gerente(Integer horasTrabajadas, Boolean esposa, Integer hijos, Integer antiguedad, Boolean esGerente) {
		super(horasTrabajadas, esposa, hijos, antiguedad, esGerente);
	}

	public Double getSalarioPorHora() {
		return salarioPorHora;
	}

	public Double getSalarioPorAntiguedad() {
		return salarioPorAntiguedad;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public Double calcularSalario(Integer horas, Boolean esposa, Integer hijos, Integer antiguedad) {
		Double auxSalario = (horas * salarioPorHora) + getSalarioFamiliar() + (antiguedad * getSalarioPorAntiguedad());

		setSalario(auxSalario);

		return auxSalario;
	}

}
