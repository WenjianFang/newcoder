import java.util.Arrays;


public class Main {

	public static void main(String[] args){
		int[] stack = {1,2,3,4,5,6,7,8,9,0};
		int top = 10;
		
		System.out.println(Arrays.toString(stack));
		int[] ret = new ReverseStack().reverseStackRecursively(stack, top);
		System.out.println(Arrays.toString(ret));
	}
	
}
