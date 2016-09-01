
import java.util.*;

public class Rotate {
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
    	int[][] ret = new int[n][n];
    	
    	for(int i=0; i<n; i++)
    		for(int j=0; j<n; j++)
    			ret[j][n-i-1] = mat[i][j];
    	
    	return ret;
    }
}