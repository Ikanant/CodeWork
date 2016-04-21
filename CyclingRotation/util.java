public class util {
	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4};
		int B[] = solution1(A, 2);

		for (int e : B) {
			System.out.println(e);
		}
	}

	// BEST answer
	public static int[] solution1(int[] A, int K) {
		System.out.println("enter solution");
		if(K%A.length==0 || A.length%K==0){
			System.out.println("inception");
			return solution1(solution1(A, K-1),1);
		}

		int tempOne = A[0];
		int tempTwo;
		int swapIndex = K;
		for (int i = 0; i < A.length; i++) {
			while (swapIndex >= A.length) {
				swapIndex -= A.length;
			}

			tempTwo = A[swapIndex];

			A[swapIndex] = tempOne;

			tempOne = tempTwo;

			swapIndex += K;
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
