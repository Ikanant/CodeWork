class util {
  public static void main(String[] args) {
    System.out.println(solution(2,12,3));
  }

  public static int solution(int A, int B, int K){
    return (A%K==0) ? (B/K - A/K) + 1 : (B/K - A/K);
  }
}
