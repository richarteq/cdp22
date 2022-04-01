package trab03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Paralelo2 {
	
	// Maximum number of threads in thread pool
	static final int MAX_T = 3;

	
	public static void main(String[] args) {
				
		int cantidad = Integer.parseInt(args[0]);
		
		ArrayList<Thread> hilitos = new ArrayList<Thread>();
		for(int i=1;i<=cantidad;i=i+1) {			
			hilitos.add(new Contador2());			
		}		
		
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		Iterator<Thread> iter = hilitos.iterator();
		while (iter.hasNext()) {
            pool.execute(iter.next());
        }
		
		pool.shutdown();
		
				

	}

}
