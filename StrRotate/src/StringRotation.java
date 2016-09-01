import java.util.*;

public class StringRotation {
    public String rotateString(String A, int n, int p) {
        // write code here
    	String str = new String();
    	str = str.concat(A.substring(p+1, n));
    	str = str.concat(A.substring(0, p+1));/*start --> endindex-1*/
    	return str;
    }
}
