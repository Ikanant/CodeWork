class util{
  public static void main(String[] args){
    int A [] = {1,1,1,1,0,0,0,-1,1};

    System.out.println(solution(A));
  }

  public static int solution(int[] A){
    int leftIndex = 0;
    int rightIndex = A.length-1;

    int leftSum = A[0];
    int rightSum = A[A.length-1];

    while(leftIndex+1!=rightIndex){
      if( (leftSum<rightSum && leftSum>0) || (leftSum>rightSum && leftSum<0) ){
        leftIndex++;
        leftSum += A[leftIndex];
      }
      else{
        rightIndex--;
        rightSum += A[rightIndex];
      }
    }

    return toPos(rightSum-leftSum);
  }

  private static int toPos(int num){
    if(num<0)
      num *= -1;

    return num;
  }
}
