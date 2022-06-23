package ar.edu.unlam.java;

public class EmpleadoTemp extends Empleado {
	private final Double salarioPorHora = 200.0;
	private Double salario;

	public EmpleadoTemp(Integer horasTrabajadas, Boolean esposa, Integer hijos, Integer antiguedad) {
		super(horasTrabajadas, esposa, hijos, antiguedad);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public Double calcularSalario(Integer horas, Boolean esposa, Integer hijos, Integer antiguedad) {
		Double auxSalario = (horas * salarioPorHora) + getSalarioFamiliar();

		setSalario(auxSalario);

		return auxSalario;
	}

}
