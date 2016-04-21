class util{
  public static void main(String[] args){
    int A [] = {-4,1,-5,12,5};

    System.out.println(solution(A));
  }

  public static int solution(int[] A){
    int leftIndex = 0;
    int rightIndex = A.length-1;

    int leftSum = A[0];
    int rightSum = A[A.length-1];
    while(leftIndex+1!=rightIndex){
      if(leftSum <= rightSum){
        leftIndex++;
        leftSum += A[leftIndex];
      }
      else{
        rightIndex--;
        rightSum += A[rightIndex];
      }
    }

    int diff = rightSum-leftSum;

    if (diff<0)
      diff *= -1;

    return diff;
  }
}
