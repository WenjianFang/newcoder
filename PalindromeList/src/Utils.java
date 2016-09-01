
public final class Utils {

	private Utils(){}
	public static void print(ListNode l){
    	ListNode tmp = l;
    	while(tmp.next != null){
    		System.out.print(tmp.val+" ");
    		tmp = tmp.next;
    	}
    	System.out.println(tmp.val);
    }
}
