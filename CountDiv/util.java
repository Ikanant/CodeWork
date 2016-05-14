class util {
  public static void main(String[] args) {
    System.out.println(solution(6,11,2));
  }

  public static int solution(int A, int B, int K){
    int count = 0;

    for (int i=A; i<=B; i++){
      if (i%K == 0){
        count++;
      }
    }

    return count;
  }
}
