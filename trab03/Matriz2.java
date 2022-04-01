package trab03;

public class Matriz2 extends Thread{
	
	//Matrices
	int A[][];
	int B[][];
	int C[][];
	
	public Matriz2(int a[][], int b[][]) {
		//Inicialización
		this.A = a;
		this.B = b;
		this.C = new int[this.A.length][this.B[0].length];
	}
	
	public boolean evalMatr() {
		//Evaluación de factibilidad
		if( this.A.length == this.B[0].length) {
			return true;
		}
		return false;
	}
	
	public void run() {
		if(evalMatr()) {
			//Multiplicaciónde matrices A*B		
			 for(int i = 0; i<this.A.length;i++)
		       {
		    	   for(int j = 0;j<this.B[0].length;j++)
		    	   {
		    		   for(int k = 0;k<this.A[0].length;k++)
		    		   {
		    			   this.C[i][j] += this.A[i][k]*this.B[k][j];
		    		   }
		    	   }
		       }
		}else {
			System.out.println(":(");
		}
		
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
