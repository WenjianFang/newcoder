import java.util.*;

public class ReverseStack {
    public int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
    	int[] ret = new int[top];
    	
    	reverseStackInside(stack, top-1, ret, 0);
    	
    	
    	return ret;
    }
    private void reverseStackInside(int[] stack, int top, int[] ret, int ret_top){
    	ret[ret_top] = stack[top];
    	if(top == 0) return;
    	else
    		reverseStackInside(stack, top-1, ret, ret_top+1);
    	
    }
}
