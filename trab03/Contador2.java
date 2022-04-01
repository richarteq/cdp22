package trab03;

public class Contador2 extends Thread{	
	public void run() {
		
		
		for(int i=1;i<=10;i=i+1) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}
}
