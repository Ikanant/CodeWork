public class util {
	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7,8,9,10};

		A = solution1(A, 12);

		for(int i:A){
			System.out.print(i);
		}
	}

	public static int[] reverseArray(int[] A, int left, int right){
		int temp;

		for(int i=left, j=right; i<=(left+right)/2; i++, j--){
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}

		return A;
	}

	// BEST answer
	public static int[] solution1(int[] A, int K) {
		if (A.length>0){
			if(K>=A.length)
				K %= A.length;

			if(K>0){
				A = reverseArray(A,0,A.length-1);
				A = reverseArray(A,0,K-1);
				A = reverseArray(A,K,A.length-1);
			}
		}
		return A;
	}

	// Good track answer but not perfect
	public static int[] solution2(int[] A, int K) {

		while (K != 0) {
			int tempOne = A[0];
			int tempTwo;
			for (int i = 1; i <= A.length; i++) {
				if (i != A.length) {
					tempTwo = A[i];
					A[i] = tempOne;
				} else {
					tempTwo = A[0];
					A[0] = tempOne;
				}

				tempOne = tempTwo;

			}
			K--;
		}

		return A;
	}

	// Cheat Answer
	public static int[] solution3(int[] A, int K) {
		int B[] = A.clone();

		int shiftLocation;
		for (int index = 0; index < A.length; index++) {
			shiftLocation = index + K;

			while (shiftLocation > A.length - 1) {
				shiftLocation -= A.length;
			}

			B[shiftLocation] = A[index];
		}

		return B;
	}
}
