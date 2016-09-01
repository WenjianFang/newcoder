import java.util.*;

public class FoldPaper {
    public String[] foldPaper(int n) {
        // write code here
    	int m = (int)(Math.pow(2, n)-2);
    	String[] ret = new String[m+1];
    	
    	foldPaperInside(ret, m);
    	return ret;
    	
    }
    private void foldPaperInside(String[] ret, int m){
    	if(m == 0){
    		ret[0]="down";
    		return;
    	}
    	else{
    		int i = m;
    		while(i >= 1){
    			int dir=-1;/*down*/
    			for(int j=i/2; j<=m; j+=(i+1)){
    				if(dir==-1) ret[j]="down";
    				else ret[j] = "up";
    				dir = (-1)*dir;
    			}
    			i = i/2;
    		}
    	}
    }
}