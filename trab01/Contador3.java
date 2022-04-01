package trab01;

public class Contador3  implements Runnable {
	
	String name;
	
	public Contador3(String a) {this.name=a;}
	
	public void run() {
		
		long inicioSP = System.nanoTime();
		for(int i=1;i<=10;i=i+1) {
			System.out.println(this.name + " : " + i);
		}
		long finSP = System.nanoTime();
		
		System.out.println(this.name + " : " + (finSP - inicioSP));
	}
}
