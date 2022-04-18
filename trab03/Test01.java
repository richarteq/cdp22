package trab03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Test01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int tamano;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca el tamaño máximo para la dimensión de la última matriz cuadrada: " );
        tamano = teclado.nextInt();
        
		//int[][] m1 = {{1,2,3},{4,5,6}}; //2*3
		//int[][] m2 = {{7,8},{9,10},{11,12}}; //3*2
		
		
		/**/
		
		//int[][] C = new int[ORDEN][ORDEN];
		
		//Matriz M01 = new Matriz(m1, m2);
		
		//ArrayList<Matriz> restaurant = new ArrayList<Matriz>();
        
        String archivoInsercion = "multMatrSec.txt";
        
			PrintWriter oS = new PrintWriter(archivoInsercion);
		
		
		for(int t=1;t<=tamano;t++) {
			
			int[][] m1 = crearMatriz(t, t);
			int[][] m2 = crearMatriz(t, t);
		
			Matriz mozo = new Matriz(m1, m2);	
			long inicioSP = System.nanoTime();
			mozo.multiMatr();
			long finSP = System.nanoTime();
			//System.out.println((finSP - inicioSP));	
			oS.println( String.valueOf( (finSP - inicioSP) ) );
					
		}
		
		oS.close();
        
        // plot "/Users/richarteq/eclipse-workspace/Algoritmica/insercion.txt" with lines
        
        /*JavaPlot p = new JavaPlot();
		p.addPlot("\"/home/richart/eclipse-workspace/CDP2022a/multMatrSec.txt\" with lines");
		p.plot();*/
		
		
		
	/*
		System.out.println( M01.evalMatr());
		
		M01.printMatr(m1);
		M01.printMatr(m2);
		
		M01.multiMatr();
		
		M01.printResult();
		*/
		
		

	}
	
	private static int[][] crearMatriz(int m, int n) {
		int random; int[][] M = new int [m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				random = (int)(Math.random()*10);
				M[i][j] = random;
				//System.out.print("\t"+random);
			}//System.out.println("");
		}//System.out.println("");
		return M;
		
	}

}
