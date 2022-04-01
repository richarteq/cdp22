package trab03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paralelo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		
		int cantidad = Integer.parseInt(args[0]);
		
		//ArrayList<Thread> hilitos = new ArrayList<Thread>();
		
		List<Thread> hilitos2 = new ArrayList<>();;
		
		for(int i=1;i<=cantidad;i=i+1) {			
			//hilitos.add(new Contador2());
			hilitos2.add(new Contador2());
		}
			
		/*Iterator<Thread> iter = hilitos.iterator();
		while (iter.hasNext()) {
            iter.next().start();
        }*/
		
		Iterator<Thread> iter2 = hilitos2.iterator();
		while (iter2.hasNext()) {
            iter2.next().start();
        }
		
		
		

	}

}
