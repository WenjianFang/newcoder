import java.util.*;

public class ArrayMex {
    public int findArrayMex(int[] A, int n) {
        // write code here
    	int l=0;
    	int r=n;
    	
    	while(l<r){
    		if(A[l] == l+1) l++;
    		else if((A[l] < l+1)||(A[l] > r)||(A[A[l]-1] == A[l])){
    			r--;
    			A[l] = A[r];
    		}
    		else{
    			int tmp = A[l];
    			A[l] = A[A[l]-1];
    			A[tmp-1] = tmp;
    		}
    	}
    	return l+1;
    }
}