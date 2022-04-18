package trab03;

public class Matriz2 extends Thread{
	
	//Matrices
	int A[][];
	int B[][];
	int C[][];
	int fila, columna;
	
	public Matriz2(int a[][], int b[][], int fi, int co, int[][] C) {
		//Inicialización
		this.A = a;
		this.B = b;
		this.fila = fi;
		this.columna = co;
		this.C = C;
		//this.C = new int[this.A.length][this.B[0].length];
	}
	
	public boolean evalMatr() {
		//Evaluación de factibilidad
		if( this.A.length == this.B[0].length) {
			return true;
		}
		return false;
	}
	
	public void run() {
		int suma = 0;
		for(int k=0; k<this.A[0].length; k++) {
			suma = suma + this.A[this.fila][k]*B[k][this.columna];
			this.C[fila][columna] = suma;
		}
		//Imprimiendo el resultado de una fila por columna
		//System.out.println(Thread.currentThread().getName() + " ("+(this.fila+1)+","+(this.columna+1)+") = "+suma);
		System.out.println(this.getName() + " ("+(this.fila+1)+","+(this.columna+1)+") = "+suma);
	}
	
	public void printMatr(int m[][]) {
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
	
	public void printResult() {
		//Imprimo C
		printMatr(this.C);
	}

}
