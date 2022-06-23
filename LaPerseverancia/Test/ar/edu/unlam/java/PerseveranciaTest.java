package ar.edu.unlam.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PerseveranciaTest {
	List<Empleado> listaDeEmpleados = new ArrayList<Empleado>();

	EmpleadoTemp empleado1 = new EmpleadoTemp(80, true, 0, 0);
	EmpleadoPerm empleado2 = new EmpleadoPerm(80, true, 2, 6, false);
	EmpleadoPerm empleado3 = new EmpleadoPerm(160, true, 0, 4, false);
	Gerente gerente1 = new Gerente(160, true, 1, 10, true);
	

	Empresa laPerseverancia = new Empresa("14-23433421-4", "La Perseverancia SRL", listaDeEmpleados);
	

	@Test
	public void calcularSueldoEmpleado1() {
		Double valorEsperado = 16100.0;
		Double valorObtenido = empleado1.calcularSalario(empleado1.getHorasTrabajadas(), empleado1.getEsposa(),
				empleado1.getHijos(), empleado1.getAntiguedad());

		Assert.assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void calcularSueldoEmpleado2() {
		Double valorEsperado = 25100.0;
		Double valorObtenido = empleado2.calcularSalario(empleado2.getHorasTrabajadas(), empleado2.getEsposa(),
				empleado2.getHijos(), empleado2.getAntiguedad());

		Assert.assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void calcularSueldoEmpleado3() {
		Double valorEsperado = 48500.0;
		Double valorObtenido = empleado3.calcularSalario(empleado3.getHorasTrabajadas(), empleado3.getEsposa(),
				empleado3.getHijos(), empleado3.getAntiguedad());

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void calcularSueldoGerente() {
		Double valorEsperado = 65800.0;
		Double valorObtenido = gerente1.calcularSalario(gerente1.getHorasTrabajadas(), gerente1.getEsposa(), gerente1.getHijos(), gerente1.getAntiguedad());
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void calcularSueldoEmpresa() {
		listaDeEmpleados.add(empleado1);
		listaDeEmpleados.add(empleado2);
		listaDeEmpleados.add(empleado3);
		listaDeEmpleados.add(gerente1);
		
		Double valorEsperado = 155500.0;
		Double valorObtenido = laPerseverancia.calcularSalarioTotal();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
