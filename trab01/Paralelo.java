package trab01;

public class Paralelo {

	public static void main(String[] args) {
		
		//long inicioT = System.nanoTime(); //Puede estar aquí o antes de start()
		
		Contador2 obj01 = new Contador2();
		Contador2 obj02 = new Contador2();
		Contador2 obj03 = new Contador2();
		
		long inicioT = System.nanoTime();
		
		obj01.start(); obj02.start(); obj03.start();
		
		long finT = System.nanoTime();
		
		System.out.println("TOTAL ENGAÑOZO: " + (finT - inicioT));

	}

}
