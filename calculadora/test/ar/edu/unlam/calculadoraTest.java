package ar.edu.unlam;

import junit.framework.Assert;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void queSePuedaDividir() throws Exception{
		calculadora miCalculadora = new calculadora();
		Integer esperado = 2;
		Integer actual = 2;
		miCalculadora.dividir(esperado, actual);
		Assert.assertEquals(esperado, actual);
	}

	@Test(expected = Exception.class)
	public void queNoPuedaDividirPorCero() throws Exception{
		calculadora miCalculadora = new calculadora();
		Integer esperado = 5;
		Integer actual = 0;
		miCalculadora.dividir(esperado, actual);
		Assert.assertEquals(esperado, actual);
		

	}

}
