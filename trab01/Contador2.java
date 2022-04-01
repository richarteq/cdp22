package trab01;

public class Contador2 extends Thread{	
	public void run() {
		
		long inicioSP = System.nanoTime();
		for(int i=1;i<=10;i=i+1) {
			System.out.println(this.getName() + " : " + i);
		}
		long finSP = System.nanoTime();
		
		System.out.println(this.getName() + " : " + (finSP - inicioSP));
	}
}
