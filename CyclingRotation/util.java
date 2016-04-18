public class util {
	public static void main(String[] args){
		int A [] = {1,2,3,4,5};
		int B [] = solution(A, 6);

		for(int e: B){
			System.out.println(e);
		}
	}

	public static int[] solution(int[] A, int K) {
        int B [] = A.clone();

        int shiftLocation;
        for(int index=0; index<A.length; index++){
        	shiftLocation = index+K;

    		while(shiftLocation > A.length-1){
    			shiftLocation -= A.length;
    		}

            B[shiftLocation] = A[index];
        }

        return B;
    }
}
