package exercise1;
public class Fibonacci {
	private int[] precalculated = null;
	
	public int fibRec(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = fibRec(n-1) + fibRec(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	
	public static int fibStatic(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fibStatic(n-1) + fibStatic(n-2);
			return result;
		}
	}
	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}	
}