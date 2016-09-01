import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
	}
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
    	// write code here
    	ListNode list1 = A;
    	ListNode list2 = divideList(A);
    	list1 = reverse(list1);
    	Utils.print(list1);
    	Utils.print(list2);
    	while(list1 != null){
    		if(list1.val == list2.val){
    			list1 = list1.next;
    			list2 = list2.next;
    		}
    		else break;
    	}
    	if((list1 == null)&&(list2 == null))
    		return true;
    	else return false;
    }
    
    private ListNode reverse(ListNode list1){
    	int n = 0;
    	ListNode tmp = list1;
    	while(tmp != null){
    		n++;
    		tmp = tmp.next;
    	}
    	if(n == 1) return list1;
    	if(n == 2) {
    		tmp = list1.next;
    		tmp.next = list1;
    		list1.next = null;
    		list1 = tmp;
    		return list1;
    	}
    	ListNode p1 = list1;
    	ListNode p2 = p1.next;
    	ListNode p3 = p2.next;
    	
    	while(p3 != null){
    		p1.next = p3;
    		p2.next = list1;
    		list1 = p2;
    		p2 = p3;
    		p3 = p2.next;
    	}
    	p2.next = list1;
    	list1 = p2;
    	p1.next = null;
    	
    	return list1;
    }
    private ListNode divideList(ListNode A){
    	ListNode list2;
    	ListNode tmp = A;
    	int count = 0;
    	while(tmp != null){
    		count++;
    		tmp = tmp.next;
    	}
    	
    	if(count <= 1) return A;
    	tmp = A;
    	int i = count/2;
    	ListNode p = tmp;
    	while(i > 0){
    		p = tmp;
    		tmp = tmp.next;
    		i--;
    	}
    	p.next = null;
    	if(count % 2 == 0) list2 = tmp;
    	else list2 = tmp.next;
    	    	
    	return list2;
    }
}