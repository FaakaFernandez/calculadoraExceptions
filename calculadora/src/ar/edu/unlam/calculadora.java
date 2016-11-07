package ar.edu.unlam;

public class calculadora {
	public Integer dividendo;
	public Integer divisor;

	public Integer dividir(Integer dividendo, Integer divisor) throws Exception {

		if (divisor != 0) {
			return dividendo / divisor;
		} else {
			throw new Exception("No se puede dividir por 0");
		}
	}
}
