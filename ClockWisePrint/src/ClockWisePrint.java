import java.util.*;

public class ClockWisePrint {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
    	int[] ret = new int[n*m];
    	
    	int i = 0;
    	int j = 0;
    	int index = 0;
    	int circle = 1;
    	while(true){
    		for(j=circle-1; j<=m-circle; j++)
    			ret[index++] = mat[i][j];
    		if(index == (n*m)) return ret;
    		j--;
    		for(i=circle; i<=n-circle; i++)
    			ret[index++] = mat[i][j];
    		if(index == (n*m)) return ret;
    		i--;
    		for(j=m-circle-1; j>=(circle-1); j--)
    			ret[index++] = mat[i][j];
    		if(index == (n*m)) return ret;
    		j++;
    		for(i=n-circle-1; i>=circle; i--)
    			ret[index++] = mat[i][j];
    		if(index == (n*m)) return ret;
    		i++;
    		
    		circle++;
    	}
    	
    	//return ret;
    }
}