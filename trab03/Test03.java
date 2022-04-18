package trab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		int tamano;

        /*@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca el tamaño máximo para la dimensión de la última matriz cuadrada: " );
        tamano = teclado.nextInt();*/
        
		int ORDEN = 4;
		int[][] A = crearMatriz(ORDEN, ORDEN);
		int[][] B = crearMatriz(ORDEN, ORDEN);
		int[][] C = new int[ORDEN][ORDEN];
		
		ArrayList<Thread> restaurant = new ArrayList<Thread>();
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length;j++) {
				/**/
				Thread mozo = new Thread(new Matriz2(A,B,i,j,C));
				
				/**/
				restaurant.add(mozo);
				mozo.start();
			}
		}
		
		int vivos = restaurant.size();
		while(vivos>0) {
			int encuesta = 0;
			for (Thread hilito : restaurant) {
				if(hilito.isAlive()) {
					encuesta = encuesta+1;
				}
			}
			vivos=encuesta;
		}
		
		printMatr(C);

	}

	private static int[][] crearMatriz(int m, int n) {
		int random; int[][] M = new int [m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				random = (int)(Math.random()*10);
				M[i][j] = random;
				System.out.print("\t"+random);
			}System.out.println("");
		}System.out.println("");
		return M;
		
	}
	
	public static void printMatr(int m[][]) {
		//Imprime una matriz
		for (int x=0; x < m.length; x++) {
			  for (int y=0; y < m[x].length; y++) {
			    System.out.print (m[x][y]);
			    	if (y!=m[x].length-1) {
			    		System.out.print("\t");
			    	}else {
			    		System.out.print("\n");			    	
			    }
			  }
			}		
	}

}
