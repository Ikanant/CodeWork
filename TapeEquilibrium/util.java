class util{
  public static void main(String[] args){
    int A [] = {3,1,2,4,3};

    System.out.println(solution(A));
  }

  public static int solution(int[] A){
    int leftSum=A[0];
    int rightSum=0;
    for(int i=1; i<A.length; i++){
      rightSum += A[i];
    }

    System.out.println(leftSum + " " + rightSum);

    int diff;
    int minDiff=999999;

    for(int j=1;j<A.length; j++){
      diff = toPos(rightSum-leftSum);

      if(diff==0) {
        minDiff = 0;
        break;
      }
      else if(diff < minDiff){
        minDiff = diff;
      }
      leftSum += A[j];
      rightSum -= A[j];
    }

    return minDiff;
  }

  private static int toPos(int num){
    if(num<0)
      num *= -1;

    return num;
  }
}
