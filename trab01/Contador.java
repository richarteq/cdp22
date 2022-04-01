package trab01;

public class Contador {
	
	String nombre;
	
	public Contador(String a) {this.nombre=a;}
	

	public void contar() {
		
		long inicioSP = System.nanoTime();
		for(int i=1;i<=10;i=i+1) {
			System.out.println(this.nombre + " : " + i);
		}
		long finSP = System.nanoTime();
		
		System.out.println(this.nombre + " : " + (finSP - inicioSP));
		
	}
}
