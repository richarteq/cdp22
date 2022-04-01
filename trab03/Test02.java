package trab03;

public class Test02 {

	public static void main(String[] args) {
		
		int[][] m1 = {{1,2,3},{4,5,6}}; //2*3
		int[][] m2 = {{7,8},{9,10},{11,12}}; //3*2
		
		Matriz M01 = new Matriz(m1, m2);
		
		System.out.println( M01.evalMatr());
		
		M01.printMatr(m1);
		M01.printMatr(m2);
		
		M01.multiMatr();
		
		M01.printResult();

	}

}
