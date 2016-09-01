
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "PQWIVLQQ";
		int n = 8;
		int p = 5;
		StringRotation r = new StringRotation();
		String B = r.rotateString(A, n, p);
		System.out.println("B is"+B);
	}

}
