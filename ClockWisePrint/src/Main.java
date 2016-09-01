import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
		int n = 3;
		int m=4;
		int[] ret = new ClockWisePrint().clockwisePrint(mat, n, m);
		System.out.println(Arrays.toString(ret));
	}

}
