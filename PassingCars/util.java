class util{
  public static void main(String[] args) {
    int[] myArray = {1,0,1,0,1,1};

    System.out.println(solution(myArray));
  }

  public static int solution(int[] A) {
     int adder=0;
      int pairs=0;

      for (int elem: A){
          if (elem==0){
              adder++;
          } else if(elem==1) {
              pairs = pairs+adder;
          }
      }

      pairs = (pairs <= 1000000000 && pairs>=0) ? pairs : -1;

      return pairs;
  }
}
