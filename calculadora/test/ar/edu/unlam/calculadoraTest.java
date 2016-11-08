package ar.edu.unlam;

import junit.framework.Assert;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void queSePuedaDividir() throws Exception {
		Calculadora miCalculadora = new Calculadora();
		Integer esperado = 2;
		Integer actual = 2;
		miCalculadora.dividir(esperado, actual);

	}

	@Test(expected = Exception.class)
	public void queNoPuedaDividirPorCero() throws Exception {
		Calculadora miCalculadora = new Calculadora();
		Integer esperado = 5;
		Integer actual = 0;
		miCalculadora.dividir(esperado, actual);

	}

}
