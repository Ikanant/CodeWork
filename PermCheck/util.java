class util {
  public static void main(String[] args) {

    int[] myArr = {1,2,3,4};
    System.out.println(solution(myArr));
  }

  public static int solution(int[] A) {
      int value = 0;
      for (int i=1; i<=A.length; i++){
          value ^= i;
          value ^= A[i-1];
      }

      if (value == 0) {
          return 1;
      } else {
          return 0;
      }
  }
}
