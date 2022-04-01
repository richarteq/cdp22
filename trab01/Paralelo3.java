package trab01;

public class Paralelo3 {

	public static void main(String[] args) {
		
		
		long inicioT = System.nanoTime();
		
		Contador3 obj01 = new Contador3("Richart");
		
		Contador3 obj02 = new Contador3("Juan");
		Contador3 obj03 = new Contador3("Rosa");
		
		Thread t1 = new Thread(obj01);
		Thread t2 = new Thread(obj02);
		Thread t3 = new Thread(obj03);
		t1.start(); t2.start(); t3.start();
		 
		
		long finT = System.nanoTime();
		
		System.out.println("TOTAL" + (finT - inicioT));

	}

}
