
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,4,4,5,3,2};
		ListNode root = new ListNode(array[0]);
		ListNode tmp = root;
		for(int i = 1; i<array.length; i++){
			ListNode p = new ListNode(array[i]);
			p.next = null;
			tmp.next = p;
			tmp = p;			
		}
		Utils.print(root);
		PalindromeList pl = new PalindromeList();
		boolean ret = pl.chkPalindrome(root);
		System.out.println(ret);
	}

}
