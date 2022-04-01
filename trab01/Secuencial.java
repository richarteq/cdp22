package trab01;

public class Secuencial {

	public static void main(String[] args) {
		
		
		long inicioT = System.nanoTime();
		
		Contador obj01 = new Contador("Richart");
		Contador obj02 = new Contador("Juan");
		Contador obj03 = new Contador("Rosa");
		
		
		obj01.contar(); obj02.contar(); obj03.contar();
		
		long finT = System.nanoTime();
		
		System.out.println("TOTAL" + (finT - inicioT));

	}

}
