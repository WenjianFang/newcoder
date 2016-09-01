import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int n = 4;
		int m = 3;
		int[] ret = new Printer().printMatrix(mat, n, m);
		System.out.println(Arrays.toString(ret));
	}

}
