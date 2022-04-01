package trab01;

import java.util.ArrayList;

public class Paralelo2 {

	public static void main(String[] args) {
		
		ArrayList<Thread> hilos = new ArrayList<Thread>();
				
		//long inicioT = System.nanoTime(); //Puede estar aquí o antes de start()
		
		Contador2 obj01 = new Contador2();
		Contador2 obj02 = new Contador2();
		Contador2 obj03 = new Contador2();
		
		hilos.add(obj01); hilos.add(obj02); hilos.add(obj03);
		
		long inicioT = System.nanoTime();
		
		//obj01.start(); obj02.start(); obj03.start();
		
		for (Thread hilito : hilos) {
			hilito.start();
		}
		
		int vivos = hilos.size();
		while(vivos>0) {
			int encuesta = 0;
			for (Thread hilito : hilos) {
				if(hilito.isAlive()) {
					encuesta = encuesta+1;
				}
			}
			vivos=encuesta;
		}		
		long finT = System.nanoTime();
		
		System.out.println("TOTAL: " + (finT - inicioT));

	}

}
