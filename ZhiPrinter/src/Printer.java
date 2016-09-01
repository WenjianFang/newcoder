import java.util.*;

public class Printer {
    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
    	int[] ret = new int[n*m];
    	int k=0;
    	for(int i=0; i<n; i++){
    		if(i%2 == 0){
    			for(int j=0; j<m; j++) ret[k++] = mat[i][j];
    		}
    		else{
    			for(int l=m-1;l>=0;l--) ret[k++] = mat[i][l];
    		}
    	}
    	return ret;
    }
}
