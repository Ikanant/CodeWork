class util{
    public static void main(String[] args){
      int A[] = {1,2,3,4,6};

      System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int maxValue = A.length+1;

        int totalSum = 0;

        while(maxValue != 0){
            totalSum += maxValue;
            maxValue--;
        }

        for(int elem: A){
            totalSum -= elem;
        }

        return totalSum;
    }
}
