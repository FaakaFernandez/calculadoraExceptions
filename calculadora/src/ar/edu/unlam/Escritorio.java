package ar.edu.unlam;

public class Escritorio {

	private Calculadora calculadora;
	
	public Escritorio(){
		this.calculadora = new Calculadora();
	}
	
	public void hacerDivision(){
		try{
			calculadora.dividir(10, 2);
		}catch(Exception e){
			System.out.println("elevar es 1" +e.getMessage());
		}
	}
}
