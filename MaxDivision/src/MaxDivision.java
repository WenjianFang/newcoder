import java.util.*;

public class MaxDivision {
    public int findMaxDivision(int[] A, int n) {
        // write code here
    	int max = A[0];
    	int min = A[0];
    	for(int i = 0; i<A.length; i++){
    		if(A[i]>max) max = A[i];
    		if(A[i]<min) min = A[i];
    	}
    	
    	int ave = (max-min)/(A.length-1);
    	
    	int bottleNum = (max-min)/ave + 1;
    	int[] minBottle = new int[bottleNum];
    	int[] maxBottle = new int[bottleNum];
    	for(int i=0; i<bottleNum; i++){
    		minBottle[i] = Integer.MAX_VALUE;
    		maxBottle[i] = Integer.MIN_VALUE;
    	}
    	for(int i=0; i<n; i++){
    		int which = (A[i]-min)/ave;
    		if(A[i]>maxBottle[which]) maxBottle[which] = A[i];
    		if(A[i]<minBottle[which]) minBottle[which] = A[i];
    	}
    	

    	int[] array = new int[bottleNum*2];
    	int j=0;
    	for(int i = 0; i<bottleNum;i++){
    		if((minBottle[i]>=min+i*ave) && (minBottle[i]<min+(i+1)*ave)) array[j++]= minBottle[i];
    		if((maxBottle[i]<=min+(i+1)*ave)&&(maxBottle[i]>=min+i*ave)) array[j++] = maxBottle[i];
   
    	}
    	int ret = array[2]-array[1];
    	for(int i=1;i<j-2; i+=2){
    		if(array[i+1]-array[i] > ret) ret = array[i+1]-array[i];
    	}
    	return ret;
    }
}