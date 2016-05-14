class util {
  public static void main(String[] args) {
    System.out.println(solution(10,11,2));
  }

  public static int solution(int A, int B, int K){
    int count = (B-A)/K;

    if (count>1){
      return 1 + count;
    } else {
      return -1;
    }

  }
}
